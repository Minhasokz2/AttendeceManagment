package com.project.attendecemanagment;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageView= new ArrayList<>();
    private ArrayList<String> mStudentName= new ArrayList<>();
    private ArrayList<String> mRegistration = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter (Context context, ArrayList<String> mImageView, ArrayList<String> mStudentName, ArrayList<String> mRegistration ) {
        this.mImageView = mImageView;
        this.mStudentName = mStudentName;
        this.mRegistration = mRegistration;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_listview, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(context)
                .asBitmap()
                .load(mImageView.get(position))
                .into(holder.imageView);

        holder.studentNameTextView.setText(mStudentName.get(position));
        holder.registrationTextView.setText(mRegistration.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageView;
        TextView studentNameTextView;
        TextView registrationTextView;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            studentNameTextView= itemView.findViewById(R.id.studentName);
            registrationTextView= itemView.findViewById(R.id.registrationNumber);
            parentLayout=itemView.findViewById(R.id.parentLayout);


        }
    }
}


package com.project.attendecemanagment.recycleview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.project.attendecemanagment.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mStudentName = new ArrayList<>();
    private ArrayList<String> mImageView = new ArrayList<>();
    private ArrayList<String> mRegistration = new ArrayList<>();

    private Context mContext;

    public RecyclerViewAdapter(Context context, ArrayList<String> StudentName, ArrayList<String> images,ArrayList<String> registration ) {
        mStudentName = StudentName;
        mRegistration = registration;
        mImageView = images;
        mContext = context;
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

//        Glide.with(mContext)
//                .asBitmap()
//                .load(mImageView.get(position))
//                .into(holder.image);

        holder.studentName.setText(mStudentName.get(position));
        holder.registrationTextView.setText(mRegistration.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mStudentName.get(position));

                Toast.makeText(mContext, mStudentName.get(position), Toast.LENGTH_SHORT).show();


            }
        });
    }

    @Override
    public int getItemCount() {
        return mStudentName.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView studentName;
        TextView registrationTextView;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            studentName = itemView.findViewById(R.id.studentName);
            registrationTextView= itemView.findViewById(R.id.registrationNumber);

            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }
}



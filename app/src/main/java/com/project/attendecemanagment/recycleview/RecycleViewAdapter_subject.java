package com.project.attendecemanagment.recycleview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.project.attendecemanagment.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class RecycleViewAdapter_subject extends RecyclerView.Adapter<RecycleViewAdapter_subject.ViewHolder> {

    private  ArrayList <String> mSubjectName = new ArrayList<>();
//    private  ArrayList <String> mImage = new ArrayList<>();
//    private  ArrayList <String> mSecondImage = new ArrayList<>();
    Context context;

    public RecycleViewAdapter_subject(Context context,ArrayList<String> mImage, ArrayList<String> mSecondImage, ArrayList<String> mSubjectName) {
        this.context = context;
//        this.mImage = mImage;
//        this.mSecondImage = mSecondImage;
        this.mSubjectName = mSubjectName;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_listview,parent,false);

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        Log.d(TAG, "onBindViewHolder: called");

        holder.subjectName.setText(mSubjectName.get(position));
//        Glide.with(context).asBitmap().load(mImage.get(position)).into(holder.image);
//        Glide.with(context).asBitmap().load(mSecondImage.get(position)).into(holder.imageSecond);




    }

    @Override
    public int getItemCount() {
        return mSubjectName.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

//        ImageView image;
//        ImageView imageSecond;
        TextView subjectName;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

//            image = itemView.findViewById(R.id.firstIcon);
//            imageSecond = itemView.findViewById(R.id.secondIcon);
            subjectName = itemView.findViewById(R.id.sunjectName);
            parentLayout = itemView.findViewById(R.id.parentLayout);

        }
    }


}


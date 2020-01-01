package com.project.attendecemanagment;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;


public class RecyclerViewAdapter {
    private static final String TAG = "RecyclerViewAdapter";

    public class  ViewHolser extends RecyclerView.ViewHolder{
        CircleImageView imageView;
        TextView nameTextView;
        TextView registrationTextView;
        RelativeLayout parentLayout;

        public ViewHolser(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameTextView= itemView.findViewById(R.id.studentName);
            registrationTextView= itemView.findViewById(R.id.registrationNumber);


        }
    }
}

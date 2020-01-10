package com.project.attendecemanagment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.project.attendecemanagment.R;
import com.project.attendecemanagment.student.StudentSubjectList;

public class activity_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void profileDetail(View view) {
           Intent intent = new Intent(this, activity_studentProfileDetail.class);
            startActivity(intent);

    }


    public void SubjectDetail(View view) {
        Intent intent = new Intent(this,subjectDetail.class);
        startActivity(intent);
    }
}

package com.project.attendecemanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudentAttendence_RecycleView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_attendence__recycle_view);
    }

    public void userProfileIntent(View view) {
        Intent intent = new Intent(this,activity_profile.class);
        startActivity(intent);
    }
}

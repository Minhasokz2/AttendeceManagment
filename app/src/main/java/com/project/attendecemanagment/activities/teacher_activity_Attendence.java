package com.project.attendecemanagment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.project.attendecemanagment.R;
import com.project.attendecemanagment.student.StudentAttendence_RecycleView;

public class teacher_activity_Attendence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher__attendence);
    }

    public void generateCode(View view) {
        Intent intent = new Intent(this, activity_teacher_generateCode.class);
        startActivity(intent);


    }

    public void generateqr(View view) {

    }

    public void verifyAttendence(View view) {
        Intent intent = new Intent(this, StudentAttendence_RecycleView.class);
        startActivity(intent);
    }
}

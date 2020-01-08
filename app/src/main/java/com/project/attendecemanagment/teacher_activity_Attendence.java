package com.project.attendecemanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class teacher_activity_Attendence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher__attendence);
    }

    public void generateCode(View view) {
        Intent intent = new Intent(this,activity_teacher_generateCode.class);
        startActivity(intent);


    }

    public void generateqr(View view) {

    }

    public void verifyAttendence(View view) {
        Intent intent = new Intent(this,StudentAttendence_RecycleView.class);
        startActivity(intent);
    }
}

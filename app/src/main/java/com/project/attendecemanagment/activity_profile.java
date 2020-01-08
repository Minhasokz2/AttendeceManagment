package com.project.attendecemanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void profileDetail(View view) {
           Intent intent = new Intent(this,activity_studentProfileDetail.class);
            startActivity(intent);

    }

    public void subjectDetail(View view) {
        Intent intent = new Intent(this,StudentSubjectList.class);
        startActivity(intent);
    }
}

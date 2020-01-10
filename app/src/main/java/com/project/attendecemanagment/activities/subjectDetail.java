package com.project.attendecemanagment.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.attendecemanagment.R;

public class subjectDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject_detail);
    }

    public void monthlyDetail(View view) {
        Intent intent = new Intent(this,monthly_attendece.class);
        startActivity(intent);
    }
}

package com.project.attendecemanagment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.project.attendecemanagment.R;

public class activity_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
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

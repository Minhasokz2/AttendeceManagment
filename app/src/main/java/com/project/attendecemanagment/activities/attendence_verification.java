package com.project.attendecemanagment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.project.attendecemanagment.R;
import com.project.attendecemanagment.student.student_scanQr;

public class attendence_verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence_verification);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

    public void tryAgain(View view) {
        Intent intent = new Intent(this, student_scanQr.class);
        startActivity(intent);
    }

    public void userProfileIntent(View view) {
        Intent intent = new Intent(this,activity_profile.class);
        startActivity(intent);
    }
}

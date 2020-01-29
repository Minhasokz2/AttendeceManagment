package com.project.attendecemanagment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.project.attendecemanagment.R;
import com.project.attendecemanagment.student.student_scanQr;


public class user_attendence_firstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_attendence_first);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }



    public void generateQR(View view) {
        Intent intent = new Intent(this, student_scanQr.class);
        startActivity(intent);
    }
}

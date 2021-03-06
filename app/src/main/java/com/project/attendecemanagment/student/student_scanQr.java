package com.project.attendecemanagment.student;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.project.attendecemanagment.R;
import com.project.attendecemanagment.activities.attendence_verification;

public class student_scanQr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_scan_qr);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void verifyAttendence(View view) {
        Intent intent = new Intent(this, attendence_verification.class);

        startActivity(intent);

    }

    public void enterPin(View view) {
        Intent intent = new Intent(this, student_attendence_enterPin.class);
        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}

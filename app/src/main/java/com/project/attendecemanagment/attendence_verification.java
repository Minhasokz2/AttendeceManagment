package com.project.attendecemanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class attendence_verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence_verification);
    }

    public void tryAgain(View view) {
        Intent intent = new Intent(this,student_scanQr.class);
        startActivity(intent);
    }

    public void userProfileIntent(View view) {
        Intent intent = new Intent(this,activity_profile.class);
        startActivity(intent);
    }
}

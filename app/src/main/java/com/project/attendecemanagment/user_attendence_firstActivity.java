package com.project.attendecemanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class user_attendence_firstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_attendence_first);
    }

    public void generateQR(View view) {
        Intent intent = new Intent(this,student_scanQr.class);
        startActivity(intent);
    }
}

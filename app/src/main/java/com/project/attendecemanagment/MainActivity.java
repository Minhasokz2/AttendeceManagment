package com.project.attendecemanagment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.project.attendecemanagment.activities.teacher_activity_Attendence;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }



    public void login(View view) {
        Intent intent = new Intent(this,teacher_activity_Attendence.class);
        startActivity(intent);

    }
}

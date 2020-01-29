package com.project.attendecemanagment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.project.attendecemanagment.activities.teacher_activity_Attendence;
import com.project.attendecemanagment.student.student_scanQr;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        username = findViewById(R.id.userName);
        password = findViewById(R.id.passord);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }



    public void login(View view) {
        String teacher = username.getText().toString();
        Toast.makeText(this, teacher, Toast.LENGTH_SHORT).show();
         if(teacher.equals("123")){
             Intent intent = new Intent(this,teacher_activity_Attendence.class);
             startActivity(intent);
        }if(teacher.equals("321")) {
            Intent intent = new Intent(this, student_scanQr.class);
             startActivity(intent);

         }


    }
}

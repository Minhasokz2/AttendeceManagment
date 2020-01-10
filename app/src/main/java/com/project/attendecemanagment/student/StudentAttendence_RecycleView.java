package com.project.attendecemanagment.student;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.attendecemanagment.R;
import com.project.attendecemanagment.activities.activity_profile;
import com.project.attendecemanagment.recycleview.RecyclerViewAdapter;

import java.util.ArrayList;

public class StudentAttendence_RecycleView extends AppCompatActivity {


    ArrayList<String> mStudentName = new ArrayList<>();
    ArrayList<String> mRegistration = new ArrayList<>();
    ArrayList<String> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_attendence__recycle_view);
        initImageBitmaps();

    }

    public void userProfileIntent(View view) {
        Intent intent = new Intent(this, activity_profile.class);
        startActivity(intent);
    }



    private void initImageBitmaps(){
        images.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mStudentName.add("Ali Zeb");
        mRegistration.add("24543464");

        images.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mStudentName.add("Eassa Zeb");
        mRegistration.add("123456");

        images.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mStudentName.add("Shadman Zeb");
        mRegistration.add("65488");

        images.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mStudentName.add("Mohin Zeb");
        mRegistration.add("84212");

        images.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mStudentName.add("Jahanger Zeb");
        mRegistration.add("584312");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mStudentName, images,mRegistration);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

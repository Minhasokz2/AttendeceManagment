package com.project.attendecemanagment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> mStudentName = new ArrayList<>();
    ArrayList<String> mRegistration = new ArrayList<>();
    ArrayList<String> images = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public  void initImage(){
        images.add("https://en.wikipedia.org/wiki/Sammi_(2017_TV_series)#/media/File:Sammi_(music_cover).jpg");
        mStudentName.add("Ali Zeb");
        mRegistration.add("24543464");
    }

    private void initRecycleView(){
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,images,mStudentName,mRegistration);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void login(View view) {
        Intent intent = new Intent(this,teacher_activity_Attendence.class);
        startActivity(intent);

    }
}

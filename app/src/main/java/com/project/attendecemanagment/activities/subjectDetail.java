package com.project.attendecemanagment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.attendecemanagment.R;
import com.project.attendecemanagment.recycleview.RecycleViewAdapter_subject;

import java.util.ArrayList;

public class subjectDetail extends AppCompatActivity {

    private ArrayList<String > subjectNames = new ArrayList<>();
    private ArrayList<String > image = new ArrayList<>();
    private ArrayList<String > imageSecond = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject_detail);
        initBitmap();
    }

    public void monthlyDetail(View view) {
        Intent intent = new Intent(this,monthly_attendece.class);
        startActivity(intent);
    }
    private  void initBitmap(){

        subjectNames.add("first");
        image.add(String.valueOf(R.drawable.student));
        imageSecond.add(String.valueOf(R.drawable.bookshelf));

        subjectNames.add("second");

        image.add(String.valueOf(R.drawable.student));
        imageSecond.add(String.valueOf(R.drawable.bookshelf));

        subjectNames.add("third");

        image.add(String.valueOf(R.drawable.student));
        imageSecond.add(String.valueOf(R.drawable.bookshelf));

        subjectNames.add("forth");

        image.add(String.valueOf(R.drawable.student));
        imageSecond.add(String.valueOf(R.drawable.bookshelf));


        subjectNames.add("fifth");

        image.add(String.valueOf(R.drawable.student));
        imageSecond.add(String.valueOf(R.drawable.bookshelf));

        subjectNames.add("sixth");

        image.add(String.valueOf(R.drawable.student));
        imageSecond.add(String.valueOf(R.drawable.bookshelf));

        intitRecylceView();

    }
    private void intitRecylceView(){
        RecyclerView recyclerView = findViewById(R.id.recycleViewSubject);
        RecycleViewAdapter_subject adapter_subject = new RecycleViewAdapter_subject(this,image,imageSecond,subjectNames);
        recyclerView.setAdapter(adapter_subject);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}

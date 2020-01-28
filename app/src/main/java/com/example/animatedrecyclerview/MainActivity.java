package com.example.animatedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<RecyclerItem> mData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //let's make this activity on full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //hide the action bar
        getSupportActionBar().hide();


        setContentView(R.layout.activity_main);


        //ini view
        recyclerView = findViewById(R.id.recyclicViewId);
        mData = new ArrayList<>();
        //adding data
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));
        mData.add(new RecyclerItem("Title1","Content 1 which is a descripyion","10/12/2020"));

        //adapter
        recyclerAdapter = new RecyclerAdapter(this,mData);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}

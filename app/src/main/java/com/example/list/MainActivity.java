package com.example.list;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<Imageview, Textview> extends AppCompatActivity {
    Imageview v1,v2,v3,v4,v5;
    Textview t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
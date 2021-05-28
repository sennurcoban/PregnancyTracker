package com.example.pregnancytracker;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PregnanDetailActivity extends AppCompatActivity {
    private Integer day;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        day = getIntent().getIntExtra("selectedDay",0);
        setContentView(R.layout.activity_pregnant_detail);

        Toast.makeText(this,day.toString(),Toast.LENGTH_SHORT).show();


    }
}

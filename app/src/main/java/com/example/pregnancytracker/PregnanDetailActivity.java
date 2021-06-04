package com.example.pregnancytracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PregnanDetailActivity extends AppCompatActivity {
    private Integer day;
    private Button button;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        day = getIntent().getIntExtra("selectedDay",0);
        setContentView(R.layout.activity_pregnant_detail);

        Toast.makeText(this,day.toString(),Toast.LENGTH_SHORT).show();
    }
    public void buttonactivity(View view){
        Intent intent = new Intent(this,PregnanDetailActivity.class);
        startActivity(intent);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}

package com.example.pregnancytracker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class PregnanDetailActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    private Integer day;
    private Integer week;
    private Integer totalDay;
    private ImageView menuBtn;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        day = getIntent().getIntExtra("selectedDay", 0);
        week = getIntent().getIntExtra("selectedWeek", 0);
        totalDay = day + (week * 7);
        setContentView(R.layout.activity_pregnant_detail);
        setPageResources();
        setListener();

    }

    private void setListener() {
        menuBtn = findViewById(R.id.menuBtn);
        menuBtn.setOnClickListener(view -> {
            goWeekList();
        });
    }


    private void setPageResources() {
        TextView headerText = findViewById(R.id.headerTxt);
        TextView sizeInfoText = findViewById(R.id.babySizeInfoTxt);
        TextView infoDetailText = findViewById(R.id.infoDetailTxt);
        ImageView babyImg = findViewById(R.id.babyImg);

        switch (week) {
            case 1:
                headerText.setText("1.hafta");
                sizeInfoText.setText("1.hafta boyutu");
                infoDetailText.setText(getText(R.string.first_half));
                babyImg.setImageResource(R.drawable.ilkhafta);
                break;
            case 2:
                headerText.setText("2.hafta");
                sizeInfoText.setText("2.hafta boyutu");
                infoDetailText.setText("2.hafta akslşdfmdslgdsmglşd");
                babyImg.setImageResource(R.drawable.alti);
                break;

        }


    }


    public void goWeekList() {
        Intent intent = new Intent(this, WeekListActivity.class);
        startActivity(intent);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}

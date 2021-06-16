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
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class PregnanDetailActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    private Integer day;
    private Button button;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        day = getIntent().getIntExtra("selectedDay",0);
        setContentView(R.layout.activity_pregnant_detail);

        Toast.makeText(this,day.toString(),Toast.LENGTH_SHORT).show();
//        drawerLayout = findViewById(R.id.drawer_layout);
    }
//    public void ClickMenu(View view){
//        openDrawer(drawerLayout);
//    }
//
//    private static void openDrawer(DrawerLayout drawerLayout) {
//        drawerLayout.openDrawer(GravityCompat.START);
//    }
//    public void ClickLogo(View view){
//        closeDrawer(drawerLayout);
//    }
//
//    private static void closeDrawer(DrawerLayout drawerLayout) {
//
//        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
//
//            drawerLayout.closeDrawer(GravityCompat.START);
//        }
//    }
//    public void ClickFirst(View view){
//        recreate();
//    }

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

package com.example.pregnancytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Spinner spinner;
    private Spinner spinner2;
    private Button button;
    private Integer selectedWeek;
    private Integer selectedDay;


    ArrayList<Integer> week = new ArrayList<>();
    ArrayList<Integer> day = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPregnantActivity();
            }
        });


        week = new ArrayList<>();
        for (int i = 1; i < 41; i++) {
            week.add(i);
        }

        day = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            day.add(i);
        }


        ArrayAdapter<Integer> dataAdapter_week;
        dataAdapter_week = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,week);

        dataAdapter_week.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter_week);

        ArrayAdapter<Integer> dataAdapter_day;
        dataAdapter_day = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,day);

        dataAdapter_day.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter_day);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(parent.getItemAtPosition(position).equals(" "))
                {

                }
                else
                {
                    String item = parent.getItemAtPosition(position).toString();
                    selectedDay = Integer.valueOf(item);
                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_SHORT).show();


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals(" "))
                {

                }
                else
                {
                    String item = parent.getItemAtPosition(position).toString();

                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_SHORT).show();


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                // TODO Auto-generated method stub

            }
        });


//


    }
    private void openPregnantActivity(){

        Intent intent = new Intent(this,PregnanDetailActivity.class);
        intent.putExtra("selectedDay",selectedDay);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

}
package com.example.pregnancytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);


        Integer[] sayilarim = {1,2,3,4,5,6,7};
        ArrayList<Integer> sayilar = new ArrayList<>();

        //style and populate the spinner
        ArrayAdapter<Integer> dataAdapter;
        dataAdapter = new ArrayAdapter( this, android.R.layout.simple_spinner_item,sayilar);

        //dropdown layout style
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose Category"))
                {


                }
                else
                {
                    //on selecting a spinner item
                    String item = parent.getItemAtPosition(position).toString();

                    //show selected spinner item
                    Toast.makeText(parent.getContext(),"Selected: "+item, Toast.LENGTH_SHORT).show();

                    //anything else i want to do on item selection do here

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });




    }
}
package com.example.pregnancytracker;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pregnancytracker.model.WeekModel;

import java.util.ArrayList;


public class WeekListActivity extends AppCompatActivity implements OnRecyclerViewItemClickListener {
    ArrayList<WeekModel> weekModel;
    RecyclerView weekListRecycler;
    WeekListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week_list_activity);
        weekListRecycler = findViewById(R.id.weekListRecycler);
        weekModel = new ArrayList<>();
        weekModel.add(new WeekModel("1. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("2. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("3. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("4. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("5. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("6. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("7. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("8. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("9. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("10. hafta", R.drawable.ilkhafta));

        adapter = new WeekListAdapter(weekModel, this);
        adapter.setOnItemClickListener(this);
        weekListRecycler.setAdapter(adapter);


    }

    private void openDetailActivity(Integer position) {
        Intent intent = new Intent(this, PregnanDetailActivity.class);
        intent.putExtra("selectedWeek", position);
        startActivity(intent);

    }


    @Override
    public void onRecyclerViewItemClicked(int position) {
        openDetailActivity(position);
    }
}
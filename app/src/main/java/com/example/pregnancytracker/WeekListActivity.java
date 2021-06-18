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
        weekModel.add(new WeekModel("2. hafta", R.drawable.ikincihafta));
        weekModel.add(new WeekModel("3. hafta", R.drawable.ucuncu));
        weekModel.add(new WeekModel("4. hafta", R.drawable.dort));
        weekModel.add(new WeekModel("5. hafta", R.drawable.bes));
        weekModel.add(new WeekModel("6. hafta", R.drawable.alti));
        weekModel.add(new WeekModel("7. hafta", R.drawable.yedinci));
        weekModel.add(new WeekModel("8. hafta", R.drawable.sekiz));
        weekModel.add(new WeekModel("9. hafta", R.drawable.dokuz));
        weekModel.add(new WeekModel("10. hafta", R.drawable.on));
        weekModel.add(new WeekModel("11. hafta", R.drawable.onbir));
        weekModel.add(new WeekModel("12. hafta", R.drawable.oniki));
        weekModel.add(new WeekModel("13. hafta", R.drawable.onuc));
        weekModel.add(new WeekModel("14. hafta", R.drawable.ondort));
        weekModel.add(new WeekModel("15. hafta", R.drawable.onbes));
        weekModel.add(new WeekModel("16. hafta", R.drawable.onalti));
        weekModel.add(new WeekModel("17. hafta", R.drawable.onyedi));
        weekModel.add(new WeekModel("18. hafta", R.drawable.onsekiz));
        weekModel.add(new WeekModel("19. hafta", R.drawable.ondokuz));
        weekModel.add(new WeekModel("20. hafta", R.drawable.yirmi));
        weekModel.add(new WeekModel("21. hafta", R.drawable.yirmibir));
        weekModel.add(new WeekModel("22. hafta", R.drawable.yirmiiki));
        weekModel.add(new WeekModel("23. hafta", R.drawable.yirmiuc));
        weekModel.add(new WeekModel("24. hafta", R.drawable.yirmidort));
        weekModel.add(new WeekModel("25. hafta", R.drawable.yirmibes));
        weekModel.add(new WeekModel("26. hafta", R.drawable.yirmialti));
        weekModel.add(new WeekModel("27. hafta", R.drawable.yirmiyedi));
        weekModel.add(new WeekModel("28. hafta", R.drawable.yirmisekiz));
        weekModel.add(new WeekModel("29. hafta", R.drawable.yirmidokuz));
        weekModel.add(new WeekModel("30. hafta", R.drawable.otuz));
        weekModel.add(new WeekModel("31. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("32. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("33. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("34. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("35. hafta", R.drawable.ilkhafta));
        weekModel.add(new WeekModel("36. hafta", R.drawable.yirmibes));
        weekModel.add(new WeekModel("37. hafta", R.drawable.yirmibes));
        weekModel.add(new WeekModel("38. hafta", R.drawable.yirmibes));
        weekModel.add(new WeekModel("39. hafta", R.drawable.yirmibes));
        weekModel.add(new WeekModel("40. hafta", R.drawable.yirmibes));
        weekModel.add(new WeekModel("41. hafta", R.drawable.yirmibes));

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
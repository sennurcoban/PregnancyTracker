package com.example.pregnancytracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pregnancytracker.model.WeekModel;
import com.example.pregnancytracker.model.WeekRow;

import java.util.ArrayList;

class WeekListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<WeekModel> weeks;
    private LayoutInflater inflater;
    private Context context;
    private OnRecyclerViewItemClickListener listener;


    public WeekListAdapter(ArrayList<WeekModel> add, Context context) {

        weeks = add;
        this.context = context;
        this.inflater = LayoutInflater.from(context);

    }

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_week_list, parent, false);
        return new WeekRow(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final WeekRow weekRow = (WeekRow) holder;
        final WeekModel item = weeks.get(position);
        weekRow.update(item);
        weekRow.weekRoot.setOnClickListener(view -> {
            listener.onRecyclerViewItemClicked(position + 1);

        });
    }

    @Override
    public int getItemCount() {
        return weeks.size();
    }

}

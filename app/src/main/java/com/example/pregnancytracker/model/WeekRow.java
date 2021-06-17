package com.example.pregnancytracker.model;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pregnancytracker.R;


public class WeekRow extends RecyclerView.ViewHolder {
    public View view;
    public TextView headerTxt;
    public ImageView weekImg;
    public LinearLayout weekRoot;


    public WeekRow(View v) {
        super(v);

        view = v;
        headerTxt = (TextView) v.findViewById(R.id.weekTxt);
        weekImg = (ImageView) v.findViewById(R.id.weekImg);
        weekRoot = v.findViewById(R.id.weekRoot);
    }

    public void update(final WeekModel weekModel) {


        headerTxt.setText(weekModel.getHeader());
        weekImg.setImageResource(weekModel.getDrawable());
    }
}

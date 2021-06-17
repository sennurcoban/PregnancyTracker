package com.example.pregnancytracker.model;

public class WeekModel {
    String header;
    Integer drawable;


    public WeekModel(String header, Integer drawable) {
        this.header = header;
        this.drawable = drawable;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Integer getDrawable() {
        return drawable;
    }

    public void setDrawable(Integer drawable) {
        this.drawable = drawable;
    }


}

package com.example.a16022934.p02_holidays;

public class Holiday {
    String name;
    String date;
    String desc;
    int res;

    public Holiday(String name, String date, String desc, int res) {
        this.name = name;
        this.date = date;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}

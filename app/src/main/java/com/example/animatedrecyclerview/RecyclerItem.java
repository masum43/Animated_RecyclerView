package com.example.animatedrecyclerview;

public class RecyclerItem {

    String Title,COntent,Date;

    public RecyclerItem() {
    }

    public String getTitle() {
        return Title;
    }

    public RecyclerItem(String title, String COntent, String date) {
        Title = title;
        this.COntent = COntent;
        Date = date;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCOntent() {
        return COntent;
    }

    public void setCOntent(String COntent) {
        this.COntent = COntent;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}

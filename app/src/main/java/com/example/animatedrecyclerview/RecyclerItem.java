package com.example.animatedrecyclerview;

public class RecyclerItem {

    String Title,Content,Date;
    int image;

    public RecyclerItem() {
    }

    public String getTitle() {
        return Title;
    }


    public RecyclerItem(String title, String Content, String date, int image) {
        Title = title;
        this.Content = Content;
        Date = date;
        this.image = image;
    }

    public void setTitle(String title) {
        Title = title;
    }


    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

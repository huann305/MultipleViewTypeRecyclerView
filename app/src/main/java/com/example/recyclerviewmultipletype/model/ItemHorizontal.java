package com.example.recyclerviewmultipletype.model;

public class ItemHorizontal {
    private String title;
    private String view;
    private int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public ItemHorizontal(String title, String view, int img) {
        this.title = title;
        this.view = view;
        this.img = img;
    }
}

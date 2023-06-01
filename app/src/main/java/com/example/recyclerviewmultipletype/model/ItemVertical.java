package com.example.recyclerviewmultipletype.model;

public class ItemVertical {
    private String channelName;
    private String title;
    private String view;
    private String time;
    private int img;
    private int avatar;

    public ItemVertical(String channelName, String title, String view, String time, int img, int avatar) {
        this.channelName = channelName;
        this.title = title;
        this.view = view;
        this.time = time;
        this.img = img;
        this.avatar = avatar;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}

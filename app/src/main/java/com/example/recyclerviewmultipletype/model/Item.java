package com.example.recyclerviewmultipletype.model;

import java.util.List;

public class Item {

    private int type;
    private List<ItemVertical> itemVerticals;
    private List<ItemHorizontal> itemHorizontals;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<ItemVertical> getItemVerticals() {
        return itemVerticals;
    }

    public void setItemVerticals(List<ItemVertical> itemVerticals) {
        this.itemVerticals = itemVerticals;
    }

    public List<ItemHorizontal> getItemHorizontals() {
        return itemHorizontals;
    }

    public void setItemHorizontals(List<ItemHorizontal> itemHorizontals) {
        this.itemHorizontals = itemHorizontals;
    }

    public Item(int type, List<ItemVertical> itemVerticals, List<ItemHorizontal> itemHorizontals) {
        this.type = type;
        this.itemVerticals = itemVerticals;
        this.itemHorizontals = itemHorizontals;
    }
}

package com.example.recyclerviewmultipletype.model;

import com.example.recyclerviewmultipletype.adapter.ItemAdapter;

import java.util.List;

public class Item {

    private int type;
    private List<ItemVertical> itemVerticals;
    private List<ItemHorizontal> itemHorizontals;

    public List<ItemMenu> getItemMenus() {
        return itemMenus;
    }

    public void setItemMenus(List<ItemMenu> itemMenus) {
        this.itemMenus = itemMenus;
    }

    private List<ItemMenu> itemMenus;

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

    public Item(int type, List<ItemVertical> itemVerticals, List<ItemHorizontal> itemHorizontals, List<ItemMenu> itemMenus) {
        this.type = type;
        this.itemVerticals = itemVerticals;
        this.itemHorizontals = itemHorizontals;
        this.itemMenus = itemMenus;
    }
    public Item(int type, List<ItemMenu> itemMenus) {
        this.type = type;
        this.itemVerticals = null;
        this.itemHorizontals = null;
        this.itemMenus = itemMenus;
    }
    public Item() {

    }

    public void setVertical(int type, List<ItemVertical> itemVerticals){
        this.type = type;
        this.itemVerticals = itemVerticals;
        this.itemHorizontals = null;
        this.itemMenus = null;
    }

    public void setHorizontal(List<ItemHorizontal> itemHorizontals){
        this.type = ItemAdapter.TYPE_HORIZONTAL;
        this.itemVerticals = null;
        this.itemHorizontals = itemHorizontals;
        this.itemMenus = null;
    }

    public void setMenu(List<ItemMenu> itemMenus){
        this.type = ItemAdapter.TYPE_VERTICAL;
        this.itemVerticals = null;
        this.itemHorizontals = null;
        this.itemMenus = itemMenus;
    }

}

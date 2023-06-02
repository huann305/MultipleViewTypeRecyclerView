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
    public Item() {

    }

    public Item setHorizontal(List<ItemHorizontal> itemHorizontals){
        return new Item(ItemAdapter.TYPE_HORIZONTAL, null, itemHorizontals, null);
    }

    public Item setVertical(List<ItemVertical> itemVerticals){
        return new Item(ItemAdapter.TYPE_VERTICAL, itemVerticals, null, null);
    }


    public Item setMenu(List<ItemMenu> itemMenus){
        return new Item(ItemAdapter.TYPE_MENU, null, null, itemMenus);
    }

}

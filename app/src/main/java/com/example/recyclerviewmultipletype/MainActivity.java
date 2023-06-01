package com.example.recyclerviewmultipletype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewmultipletype.adapter.ItemAdapter;
import com.example.recyclerviewmultipletype.model.Item;
import com.example.recyclerviewmultipletype.model.ItemHorizontal;
import com.example.recyclerviewmultipletype.model.ItemVertical;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMain;
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.rv_main);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        itemAdapter = new ItemAdapter(this, getListData());
        rvMain.setLayoutManager(linearLayoutManager);
        rvMain.setAdapter(itemAdapter);
    }

    private List<Item> getListData() {
        List<Item> items = new ArrayList<>();

        List<ItemHorizontal> itemHorizontals = new ArrayList<>();
        itemHorizontals.add(new ItemHorizontal("Check", "100N", R.drawable.e));
        itemHorizontals.add(new ItemHorizontal("Check", "100N", R.drawable.f));
        itemHorizontals.add(new ItemHorizontal("Check", "100N", R.drawable.g));
        itemHorizontals.add(new ItemHorizontal("Check", "100N", R.drawable.h));
        itemHorizontals.add(new ItemHorizontal("Check", "100N", R.drawable.e));
        itemHorizontals.add(new ItemHorizontal("Check", "100N", R.drawable.f));
        itemHorizontals.add(new ItemHorizontal("Check", "100N", R.drawable.g));
        itemHorizontals.add(new ItemHorizontal("Check", "100N", R.drawable.h));

        List<ItemVertical> itemVerticals = new ArrayList<>();
        itemVerticals.add(new ItemVertical("Huấnn", "Test", "1T", "1", R.drawable.a, R.drawable.e));
        itemVerticals.add(new ItemVertical("Huấnn", "Test", "1T", "1", R.drawable.b, R.drawable.f));
        itemVerticals.add(new ItemVertical("Huấnn", "Test", "1T", "1", R.drawable.c, R.drawable.g));
        itemVerticals.add(new ItemVertical("Huấnn", "Test", "1T", "1", R.drawable.d, R.drawable.h));

        items.add(new Item(ItemAdapter.TYPE_HORIZONTAL, null, itemHorizontals));
        items.add(new Item(ItemAdapter.TYPE_VERTICAL, itemVerticals, null));
        items.add(new Item(ItemAdapter.TYPE_HORIZONTAL, null, itemHorizontals));
        items.add(new Item(ItemAdapter.TYPE_VERTICAL, itemVerticals, null));
        items.add(new Item(ItemAdapter.TYPE_HORIZONTAL, null, itemHorizontals));
        items.add(new Item(ItemAdapter.TYPE_VERTICAL, itemVerticals, null));

        return items;
    }
}
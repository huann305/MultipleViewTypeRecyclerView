package com.example.recyclerviewmultipletype.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewmultipletype.R;
import com.example.recyclerviewmultipletype.model.Item;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{

    public static final int TYPE_HORIZONTAL = 1;
    public static final int TYPE_VERTICAL = 2;
    public static final int TYPE_MENU = 3;
    List<Item> items;
    Context context;

    public ItemAdapter(Context context, List<Item> items) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(viewType == TYPE_HORIZONTAL){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_horizontal, parent, false);
            return new ItemViewHolder(view);
        }
        if(viewType == TYPE_VERTICAL){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_vertical, parent, false);
            return new ItemViewHolder(view);
        }
        if(viewType == TYPE_MENU){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_menu, parent, false);
            return new ItemViewHolder(view);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = items.get(position);
        if (item == null) return;

        if(TYPE_VERTICAL == holder.getItemViewType()){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, RecyclerView.VERTICAL, false);
            holder.rvItem.setLayoutManager(linearLayoutManager);
            holder.rvItem.setFocusable(false);

            ItemVerticalAdapter itemVerticalAdapter = new ItemVerticalAdapter(item.getItemVerticals());
            holder.rvItem.setAdapter(itemVerticalAdapter);
        }

        if(TYPE_HORIZONTAL == holder.getItemViewType()){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
            holder.rvItem.setLayoutManager(linearLayoutManager);
            holder.rvItem.setFocusable(false);

            ItemHorizontalAdapter itemHorizontalAdapter = new ItemHorizontalAdapter(item.getItemHorizontals());
            holder.rvItem.setAdapter(itemHorizontalAdapter);
        }


        if(TYPE_MENU == holder.getItemViewType()){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
            holder.rvItem.setLayoutManager(linearLayoutManager);
            holder.rvItem.setFocusable(false);

            MenuAdapter menuAdapter = new MenuAdapter(item.getItemMenus());
            holder.rvItem.setAdapter(menuAdapter);
        }
    }

    @Override
    public int getItemCount() {
        if(items == null) return 0;
        return items.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        RecyclerView rvItem;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            rvItem = itemView.findViewById(R.id.rv_item);
        }
    }
}

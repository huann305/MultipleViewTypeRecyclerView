package com.example.recyclerviewmultipletype.adapter;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewmultipletype.R;
import com.example.recyclerviewmultipletype.model.ItemMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHoler>{

    List <ItemMenu> list = new ArrayList<>();

    public MenuAdapter(List<ItemMenu> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MenuViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_menu, parent, false);
        return new MenuViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHoler holder, int position) {
        ItemMenu itemMenu = list.get(position);
        if(itemMenu == null) return;

        holder.btnMenu.setText(itemMenu.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MenuViewHoler extends RecyclerView.ViewHolder{

        Button btnMenu;
        public MenuViewHoler(@NonNull View itemView) {
            super(itemView);
            btnMenu = itemView.findViewById(R.id.btn_menu);
        }
    }
}

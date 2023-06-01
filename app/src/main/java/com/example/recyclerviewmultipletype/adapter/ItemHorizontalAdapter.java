package com.example.recyclerviewmultipletype.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewmultipletype.R;
import com.example.recyclerviewmultipletype.model.ItemHorizontal;

import java.util.List;

public class ItemHorizontalAdapter extends  RecyclerView.Adapter<ItemHorizontalAdapter.ItemHorizontalViewHolder>{

    List<ItemHorizontal> itemHorizontals;

    public ItemHorizontalAdapter(List<ItemHorizontal> itemHorizontals) {
        this.itemHorizontals = itemHorizontals;
    }

    @NonNull
    @Override
    public ItemHorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_horizontal,parent, false);

        return new ItemHorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHorizontalViewHolder holder, int position) {
        ItemHorizontal itemHorizontal = itemHorizontals.get(position);
        if(itemHorizontal == null) return;

        holder.imgShorts.setImageResource(itemHorizontal.getImg());
        holder.txtTitleShorts.setText(itemHorizontal.getTitle());
        holder.txtViewShorts.setText(itemHorizontal.getView());
    }

    @Override
    public int getItemCount() {
        if(itemHorizontals == null) return 0;
        return itemHorizontals.size();
    }

    public class ItemHorizontalViewHolder extends RecyclerView.ViewHolder{

        ImageView imgShorts;
        TextView txtTitleShorts;
        TextView txtViewShorts;

        public ItemHorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            imgShorts = itemView.findViewById(R.id.img_shorts);
            txtTitleShorts = itemView.findViewById(R.id.txt_title_shorts);
            txtViewShorts = itemView.findViewById(R.id.txt_view_shorts);
        }
    }
}

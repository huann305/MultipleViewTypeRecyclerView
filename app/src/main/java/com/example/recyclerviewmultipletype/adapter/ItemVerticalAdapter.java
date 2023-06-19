package com.example.recyclerviewmultipletype.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewmultipletype.R;
import com.example.recyclerviewmultipletype.model.ItemVertical;

import java.util.List;

public class ItemVerticalAdapter extends  RecyclerView.Adapter<ItemVerticalAdapter.ItemVerticalViewHolder>{

    List<ItemVertical> itemVerticals;

    public ItemVerticalAdapter(List<ItemVertical> itemVerticals) {
        this.itemVerticals = itemVerticals;
    }

    @NonNull
    @Override
    public ItemVerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_vertical, parent, false);
        return new ItemVerticalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemVerticalViewHolder holder, int position) {
        ItemVertical itemVertical = itemVerticals.get(position);
        if(itemVertical == null) return;

        holder.imgImage.setImageResource(itemVertical.getImg());
        holder.imgAvatar.setImageResource(itemVertical.getAvatar());
        holder.txtTitle.setText(itemVertical.getTitle());
        holder.txtChannelName.setText(itemVertical.getChannelName());
        holder.txtView.setText(itemVertical.getView());
        holder.txtTime.setText(itemVertical.getTime());
    }

    @Override
    public int getItemCount() {
        if(itemVerticals == null) return 0;
        return itemVerticals.size();
    }

    public class ItemVerticalViewHolder extends RecyclerView.ViewHolder{

        ImageView imgImage;
        ImageView imgAvatar;
        TextView txtTitle, txtChannelName, txtView, txtTime;

        public ItemVerticalViewHolder(@NonNull View itemView) {
            super(itemView);
            imgImage = itemView.findViewById(R.id.img_image);
            imgAvatar = itemView.findViewById(R.id.img_avatar);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtChannelName = itemView.findViewById(R.id.txt_channel_name);
            txtView = itemView.findViewById(R.id.txt_view);
            txtTime = itemView.findViewById(R.id.txt_time);
        }
    }
}

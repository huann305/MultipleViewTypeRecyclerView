package com.example.recyclerviewmultipletype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewmultipletype.adapter.ItemAdapter;
import com.example.recyclerviewmultipletype.model.Item;
import com.example.recyclerviewmultipletype.model.ItemHorizontal;
import com.example.recyclerviewmultipletype.model.ItemMenu;
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
        itemHorizontals.add(new ItemHorizontal("Hồi Ức Ta Đã Yêu Remix - Chẳng Biết Anh Đang Nơi Nào Có Ai Kề Cạnh Không - Nhạc Hot TikTok Hiện Nay", "100N", R.drawable.e));
        itemHorizontals.add(new ItemHorizontal("[Playlist speed up]\uD83D\uDD25chẳng biết anh đang nơi nào có ai kề cạnh không.., hồi ức ta đã yêu, Noivoianh", "100N", R.drawable.f));
        itemHorizontals.add(new ItemHorizontal("[Playlist 1 hour]\uD83D\uDD25lạc vào chốn... tình ca tình ta, gió, cold dont | Tổng hợp nhạc speed up cực relax", "100N", R.drawable.g));
        itemHorizontals.add(new ItemHorizontal("Gió Lofi - JanK | Gió Nhẹ Sang Tôi Ngỡ Trời Xuân ♫ Nhạc Lofi Chill Buồn Hot TikTok", "100N", R.drawable.h));
        itemHorizontals.add(new ItemHorizontal("Thằng Điên,OK,Người Ấy-Nhạc Chill Tiktok 2023 -Tổng Hợp Những Bài Hát Tiktok \"Nghe Là Nghiện\"", "100N", R.drawable.e));
        itemHorizontals.add(new ItemHorizontal("[Playlist 1 hour]\uD83D\uDD25lạc vào chốn... tình ca tình ta, gió, cold dont | Tổng hợp nhạc speed up cực relax", "100N", R.drawable.f));
        itemHorizontals.add(new ItemHorizontal("[Playlist speed up]\uD83D\uDD25chẳng biết anh đang nơi nào có ai kề cạnh không.., hồi ức ta đã yêu, Noivoianh", "100N", R.drawable.g));
        itemHorizontals.add(new ItemHorizontal("Thằng Điên,OK,Người Ấy-Nhạc Chill Tiktok 2023 -Tổng Hợp Những Bài Hát Tiktok \"Nghe Là Nghiện\"", "100N", R.drawable.h));

        List<ItemVertical> itemVerticals = new ArrayList<>();
        itemVerticals.add(new ItemVertical("Huấnn", "Thằng Điên,OK,Người Ấy-Nhạc Chill Tiktok 2023 -Tổng Hợp Những Bài Hát Tiktok \"Nghe Là Nghiện\"", "1T", "1", R.drawable.a, R.drawable.e));
        itemVerticals.add(new ItemVertical("Huấnn", "Gió Lofi - JanK | Gió Nhẹ Sang Tôi Ngỡ Trời Xuân ♫ Nhạc Lofi Chill Buồn Hot TikTok", "1T", "1", R.drawable.b, R.drawable.f));
        itemVerticals.add(new ItemVertical("Huấnn", "[Playlist 1 hour]\uD83D\uDD25lạc vào chốn... tình ca tình ta, gió, cold dont | Tổng hợp nhạc speed up cực relax", "1T", "1", R.drawable.c, R.drawable.g));
        itemVerticals.add(new ItemVertical("Huấnn", "Gió Lofi - JanK | Gió Nhẹ Sang Tôi Ngỡ Trời Xuân ♫ Nhạc Lofi Chill Buồn Hot TikTok", "1T", "1", R.drawable.d, R.drawable.h));

        List<ItemMenu> itemMenus = new ArrayList<>();
        itemMenus.add(new ItemMenu("Tất cả"));
        itemMenus.add(new ItemMenu("Đề xuất mới"));
        itemMenus.add(new ItemMenu("Âm nhạc"));
        itemMenus.add(new ItemMenu("Danh sách kết hợp"));
        itemMenus.add(new ItemMenu("Trò chơi"));
        itemMenus.add(new ItemMenu("Trực tiếp"));
        itemMenus.add(new ItemMenu("Học tập"));
        itemMenus.add(new ItemMenu("Hoạt hình"));

        items.add(new Item(ItemAdapter.TYPE_MENU, itemMenus));
        items.add(new Item(ItemAdapter.TYPE_HORIZONTAL, null, itemHorizontals, null));
        items.add(new Item(ItemAdapter.TYPE_VERTICAL, itemVerticals, null, null));
        items.add(new Item(ItemAdapter.TYPE_HORIZONTAL, null, itemHorizontals, null));
        items.add(new Item(ItemAdapter.TYPE_VERTICAL, itemVerticals, null, null));
        items.add(new Item(ItemAdapter.TYPE_HORIZONTAL, null, itemHorizontals, null));
        items.add(new Item(ItemAdapter.TYPE_VERTICAL, itemVerticals, null, null));

        Item item = new Item();
        item.setItemHorizontal(itemHorizontals);
        items.add(item);

        return items;
    }
}
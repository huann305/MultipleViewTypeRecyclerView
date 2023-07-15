package com.example.recyclerviewmultipletype;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.recyclerviewmultipletype.adapter.ItemAdapter;
import com.example.recyclerviewmultipletype.model.Item;
import com.example.recyclerviewmultipletype.model.ItemHorizontal;
import com.example.recyclerviewmultipletype.model.ItemMenu;
import com.example.recyclerviewmultipletype.model.ItemVertical;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMain;
    ItemAdapter itemAdapter;
    Toolbar toolbar;
    FloatingActionButton mActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.youtube);
        toolbar.setTitle("YouTube");
        toolbar.setTitleTextAppearance(this, R.style.MyTitleStyle);
        toolbar.setTitleTextAppearance(this,R.style.MyTitleStyle);
        toolbar.setElevation(0);

        setSupportActionBar(toolbar);

        rvMain = findViewById(R.id.rv_main);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        itemAdapter = new ItemAdapter(this, getListData());
        rvMain.setLayoutManager(linearLayoutManager);

        rvMain.setHasFixedSize(true);
        rvMain.setAdapter(itemAdapter);
    }

    @NonNull
    private List<Item> getListData() {
        List<Item> items = new ArrayList<>();

        List<ItemHorizontal> itemHorizontals = new ArrayList<>();
        itemHorizontals.add(new ItemHorizontal("Hồi Ức Ta Đã Yêu Remix - Chẳng Biết Anh Đang Nơi Nào Có Ai Kề Cạnh Không - Nhạc Hot TikTok Hiện Nay", "100N", R.drawable.a));
        itemHorizontals.add(new ItemHorizontal("[Playlist speed up]\uD83D\uDD25chẳng biết anh đang nơi nào có ai kề cạnh không.., hồi ức ta đã yêu, Noivoianh", "100N", R.drawable.b));
        itemHorizontals.add(new ItemHorizontal("[Playlist 1 hour]\uD83D\uDD25lạc vào chốn... tình ca tình ta, gió, cold dont | Tổng hợp nhạc speed up cực relax", "100N", R.drawable.c));
        itemHorizontals.add(new ItemHorizontal("Gió Lofi - JanK | Gió Nhẹ Sang Tôi Ngỡ Trời Xuân ♫ Nhạc Lofi Chill Buồn Hot TikTok", "100N", R.drawable.d));
        itemHorizontals.add(new ItemHorizontal("Thằng Điên,OK,Người Ấy-Nhạc Chill Tiktok 2023 -Tổng Hợp Những Bài Hát Tiktok \"Nghe Là Nghiện\"", "100N", R.drawable.a));
        itemHorizontals.add(new ItemHorizontal("[Playlist 1 hour]\uD83D\uDD25lạc vào chốn... tình ca tình ta, gió, cold dont | Tổng hợp nhạc speed up cực relax", "100N", R.drawable.b));
        itemHorizontals.add(new ItemHorizontal("[Playlist speed up]\uD83D\uDD25chẳng biết anh đang nơi nào có ai kề cạnh không.., hồi ức ta đã yêu, Noivoianh", "100N", R.drawable.c));
        itemHorizontals.add(new ItemHorizontal("Thằng Điên,OK,Người Ấy-Nhạc Chill Tiktok 2023 -Tổng Hợp Những Bài Hát Tiktok \"Nghe Là Nghiện\"", "100N", R.drawable.d));

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

        items.add(new Item().setMenu(itemMenus));
        items.add(new Item().setHorizontal(itemHorizontals));
        items.add(new Item().setVertical(itemVerticals));
        items.add(new Item().setHorizontal(itemHorizontals));
        items.add(new Item().setVertical(itemVerticals));
        items.add(new Item().setHorizontal(itemHorizontals));
        items.add(new Item().setVertical(itemVerticals));


        return items;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.item_search).getActionView();

        ImageView searchIcon = searchView.findViewById(androidx.appcompat.R.id.search_button);
        searchIcon.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.baseline_search_24));

        searchView.setMaxWidth(Integer.MAX_VALUE);

        SearchView.SearchAutoComplete searchAutoComplete = searchView.findViewById(androidx.appcompat.R.id.search_src_text);
//        searchAutoComplete.setHintTextColor(getResources().getColor(android.R.color.darker_gray));
        return super.onCreateOptionsMenu(menu);
    }
}
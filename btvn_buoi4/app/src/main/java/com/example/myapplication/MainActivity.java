package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Food;
import com.example.myapplication.FoodAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rcv_data = findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        rcv_data.setLayoutManager(linearLayoutManager);
        FoodAdapter foodAdapter = new FoodAdapter(creMenuFood());
        rcv_data.setAdapter(foodAdapter);



    }

    private List<Food> creMenuFood(){
        List<Food> menuFood = new ArrayList<>();
        menuFood.add(new Food(R.mipmap.ic_launcher,"Mua bán có tâm","18K","20 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Ăn để lăn","28K","25 bài viết mới mỗi ngày","nhóm kín"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Chia sẻ kiến thức ","8K","2 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Thực đơn eat","38K","27 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Chicken & com soup","118K","17 bài viết mới mỗi ngày","nhóm kín"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Shrimp soup with persicaria","138K","20 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Eel soup","48K","21 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Crab soup","18K","23 bài viết mới mỗi ngày","nhóm kín"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Kimchi dish","58K","10 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Noodle soup","18K","50 bài viết mới mỗi ngày","nhóm kín"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Rice noodles","68K","10 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Beef rice noodles","18K","20 bài viết mới mỗi ngày","nhóm kín"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Crab rice noodles","78K","80 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Rice gruel with Fish","18K","20 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Eel Rice gruel","98K","90 bài viết mới mỗi ngày","nhóm kín"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Bread","18K","20 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Steamed wheat flour cake","18K","20 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Round sticky rice cake","158K","14 bài viết mới mỗi ngày","nhóm kín"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Stuffed sticky rice cake","178K","20 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Girdle-cake","198K","16 bài viết mới mỗi ngày","nhóm công khai"));
        menuFood.add(new Food(R.mipmap.ic_launcher,"Australia Stead Beef","998K","20 bài viết mới mỗi ngày","nhóm kín"));

        return menuFood;
    }
}
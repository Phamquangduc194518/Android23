package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvData;
    private userAdapter Adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvData=findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        rcvData.setLayoutManager(linearLayoutManager);


        Adapter= new userAdapter(getListUser());
        rcvData.setAdapter(Adapter);
    }

    private List<User> getListUser() {
        List<User> list =new ArrayList<>();
        list.add(new User(R.mipmap.ic_launcher, "tincode", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "hay", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "an", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "uoong", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "di choi", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "dao pho", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "ngam canh", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "chay pho", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "tan bo", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "cuoi tuoi", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "dap xe", "Hoan Kiem-Hanoi"));
        list.add(new User(R.mipmap.ic_launcher, "di bo", "Hoan Kiem-Hanoi"));


        return list;
    }
}
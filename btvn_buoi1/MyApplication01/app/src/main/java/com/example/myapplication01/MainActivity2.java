package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button btnTag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnTag = findViewById(R.id.btnTag);
        btnTag.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);

        });
    }
    }

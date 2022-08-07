package com.example.android23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity<packageContext> extends AppCompatActivity {
    // khi tạo biến trong activity thì chúng ta để private
    private Button btnClickMe;
    private TextView tvName;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Sau khi tạo biến ánh xạ biến đến button ở giao diện xml
        btnClickMe = findViewById(R.id.btnClickMe);
        tvName = findViewById(R.id.tvName);
        //1 Button - nút bấm, sự kiện bấm
        btnClickMe.setOnClickListener(view -> {
//                 khi bấm button, muốn set tên mình vào text view
//                 khi bấm button, các sự kiện mà mình muuosn sẽ được xử lý ở đây
//                 sử dụng settext để set dữ liệu vfao text view
//                 tvName.setText("a");


            //Khi ấn button tăng lên 1
//            position++;
//            // khi các biến float,.. + với 1 string-> kết qủa sẽ ra 1 string
//            tvName.setText("Đây là lần bấm thứ:" + position);
            Intent intent = new Intent(this,CodeFresher.class);
            startActivity(intent);
        });
    }
}
// sự khác nhau giữa int và integer là gì?
//kiếu số nguyên không có trường hợp NULL
//integer có trường hợp null( rất dễ xảy ra crash khi dùng)
// code ko đẹp thì dùng (Ctrl+Alt+L) -> format code(Ctrl+Alt+L)
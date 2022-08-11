package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private var edt2: EditText? = null
    private var btClickBack: Button? = null
    private var tvView2: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        edt2= findViewById(R.id.edt2)
        btClickBack= findViewById(R.id.btClickBack)
        tvView2= findViewById(R.id.tvView2)

       // nhan data tu main 1
        val intent= intent
        //set text hien len edt2
        edt2?.setText(getIntent().getStringExtra("key1"))



        // truyen data tu main 2 sang main 1
        btClickBack?.setOnClickListener {
            val intentNew=Intent()
            val code: String? = edt2?.text.toString().trim()
            intentNew.putExtra("key2",code)
            setResult(Activity.RESULT_OK,intentNew)

            finish()

        }

    }

}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var edt :EditText? = null
    private var edt1 :EditText? = null
    private var edt2 :EditText? = null
    private var bt :Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt = findViewById(R.id.edt)
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        bt = findViewById(R.id.bt)
        bt?.setOnClickListener{
            val a: Double = edt?.text.toString().toDouble()
            val b: Double = edt1?.text.toString().toDouble()
            val c: Double = edt2?.text.toString().toDouble()
            val d = b*b -4*a*c
            if(d<0)
            {
                Toast.makeText(this,"vo nghiem", Toast.LENGTH_SHORT).show()
            }
        }
        }
}

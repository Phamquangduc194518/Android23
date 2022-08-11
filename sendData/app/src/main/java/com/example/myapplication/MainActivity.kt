package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private var edt1: EditText? = null
    private var btClick: Button? = null
    private val resultContract =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {

                //lay gia tri  khoa key2
                val da_ta= result.data?.extras?.getString("key2")
                // dan gia tri key2 vao edt1
                edt1?.setText(da_ta)
            }
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt1 = findViewById(R.id.edt1)
        btClick = findViewById(R.id.btClick)


        btClick?.setOnClickListener {
            // truyen dât tu main 1 sang main 2
            val intent: Intent = Intent(this, MainActivity2::class.java)
            val dataString: String? = edt1?.text.toString().trim()
            intent.putExtra("key1", dataString)
            resultContract.launch(intent)
        }
  }
}
package com.example.btvnbuoi61application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private var tv_luu_m2:TextView? = null
    private var edt_add_tittle: EditText? = null
    private var edt_add_content: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tv_luu_m2 = findViewById(R.id.tv_luu_m2)
        edt_add_tittle = findViewById(R.id.edt_add_tittle)
        edt_add_content = findViewById(R.id.edt_add_content)

        tv_luu_m2?.setOnClickListener {
            val folder = FolderManager(

            System.currentTimeMillis().toInt(),
            edt_add_tittle?.text.toString(),
            edt_add_content?.text.toString()
            )
            val intent= Intent()
            intent.putExtra("folder", folder)
            intent.putExtra(MainActivity.KEY, MainActivity.TYPE_ADD)
            setResult(RESULT_OK, intent)
            finish()
        }


        }


}



package com.example.btvnbuoi61application

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    var edt_edit_title : EditText? = null
    var edt_edit_content : EditText? = null
    var tv_luu_m3 : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        edt_edit_title = findViewById(R.id.edt_edit_title)
        edt_edit_content = findViewById(R.id.edt_edit_content)
        tv_luu_m3 = findViewById(R.id.tv_luu_m3)

        val folder= intent?.extras?.get("folder") as FolderManager
        if(folder != null){
            edt_edit_title?.setText(folder.title)
            edt_edit_content?.setText(folder.content)


            tv_luu_m3?.setOnClickListener {
                //?:"", nghĩa là khi edt_edit_title?.text?.toString() bị null thì ta để title là rỗng
                //Set lại các giá trị title, content cho biến folder để truyền lại về màn 1
                folder?.title = edt_edit_title?.text?.toString() ?:""
                folder?.content = edt_edit_content?.text?.toString() ?:""
                val intent : Intent = Intent()
                intent.putExtra("folder", folder)
                intent.putExtra(MainActivity.KEY, MainActivity.TYPE_EDIT)
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }
}
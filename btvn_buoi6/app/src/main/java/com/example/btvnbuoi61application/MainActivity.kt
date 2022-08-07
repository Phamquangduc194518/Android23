package com.example.btvnbuoi61application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var foldermanageradapter: FolderManagerAdapter? = null
    private val dataList: ArrayList<FolderManager> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.rcv_ql)
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = linearLayoutManager
        foldermanageradapter = FolderManagerAdapter(dataList)
        recyclerView?.adapter=foldermanageradapter
        val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView?.addItemDecoration(dividerItemDecoration)

        dataList.add(FolderManager(R.drawable.item, "Tổnh hợp tin tức thời sự", "hay"))
        dataList.add(FolderManager(R.drawable.item, "Tổnh hợp sự cố", "không hay"))
        dataList.add(FolderManager(R.drawable.item, "Tổnh hợp tin tức ", "hay"))
        dataList.add(FolderManager(R.drawable.item, "Tổnh hợp bài báo", "hay"))




    }


}
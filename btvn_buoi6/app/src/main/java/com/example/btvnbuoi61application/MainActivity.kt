package com.example.btvnbuoi61application

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    companion object {
        //Những hằng số sẽ được khai báo ở đây, chúng ta có thể dùng ở mọi chỗ
        const val KEY = "KEY"
        const val TYPE_EDIT = "TYPE_EDIT"
        const val TYPE_ADD = "TYPE_ADD"
    }
    private var recyclerView: RecyclerView? = null
    private var tv_add_m1: TextView? = null
    private val tenTuyY: ArrayList<FolderManager> = ArrayList()
    private var folderManagerAdapter: FolderManagerAdapter? = null
    private val resultContract =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val type = result.data?.extras?.getString(KEY)
                if (type == TYPE_ADD) {
                    val folder = result.data?.extras?.get("folder") as? FolderManager
                    if (folder != null) {
                        tenTuyY.add(0, folder)
                    }
                    folderManagerAdapter?.notifyDataSetChanged()
                } else if (type == TYPE_EDIT) {
                    val folder = result.data?.extras?.get("folder") as? FolderManager
                    if (folder != null) {
                        //Cập nhật lại dữ liệu cho array
                        for (item in tenTuyY) {
                            if (item.id == folder.id) {
                                item.title = folder.title
                                item.content = folder.content
                                break
                            }
                        }
                        folderManagerAdapter?.notifyDataSetChanged()
                    }
                }
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connectView()
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = linearLayoutManager
        val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView?.addItemDecoration(dividerItemDecoration)


        tenTuyY.add(FolderManager(1,"Tổnh hợp tin tức thời sự", "hay"))
        tenTuyY.add(FolderManager(2,"Tổnh hợp sự cố", "không hay"))
        tenTuyY.add(FolderManager(3,"Tổnh hợp tin tức ", "hay"))
        tenTuyY.add(FolderManager(4,"Tổnh hợp bài báo", "hay"))
        tenTuyY.add(FolderManager(5,"Tổnh hợp tin tức thời sự", "hay"))
        tenTuyY.add(FolderManager(6,"Tổnh hợp tin tức thời sự", "hay"))
        tenTuyY.add(FolderManager(7,"Tổnh hợp tin tức thời sự", "hay"))
        tenTuyY.add(FolderManager(8,"Tổnh hợp tin tức thời sự", "hay"))
        tenTuyY.add(FolderManager(9,"Tổnh hợp tin tức thời sự", "hay"))
        tenTuyY.add(FolderManager(10,"Tổnh hợp tin tức thời sự", "hay"))

        folderManagerAdapter = FolderManagerAdapter(tenTuyY)
        recyclerView?.adapter = folderManagerAdapter
        folderManagerAdapter?.onItemClick = { folder, position ->
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("folder", folder)
            resultContract.launch(intent)
        }

        sendData()
    }

    fun connectView() {
        recyclerView = findViewById(R.id.rcv_ql)
        tv_add_m1 = findViewById(R.id.tv_add_m1)
    }

    fun sendData() {

        tv_add_m1?.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2::class.java)
            resultContract.launch(intent)
        }
    }
}
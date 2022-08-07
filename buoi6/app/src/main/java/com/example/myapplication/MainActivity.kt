package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ChatAdapter.ChatViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutManager = LinearLayoutManager(this)
        var recyclerview = findViewById<RecyclerView>(R.id.rcv_dt)
        recyclerview.layoutManager = layoutManager
        recyclerview.adapter = adapter
    }


    private fun createChatList(): List<Chat> {
        val chatList: MutableList<Chat> = ArrayList()

        chatList.add(Chat().apply {

            this.mess = "a"
            this.tit = "b"
        })
        chatList.add(Chat().apply {

            this.mess = "a"
            this.tit = "b"
        })
        chatList.add(Chat().apply {

            this.mess = "a"
            this.tit = "b"
        })
        chatList.add(Chat().apply {

            this.mess = "a"
            this.tit = "b"
        })
        chatList.add(Chat().apply {

            this.mess = "a"
            this.tit = "b"
        })
        chatList.add(Chat().apply {

            this.mess = "a"
            this.tit = "b"
        })
        chatList.add(Chat().apply {

            this.mess = "a"
            this.tit = "b"
        })
        chatList.add(Chat().apply {

            this.mess = "a"
            this.tit = "b"
        })
        chatList.add(Chat().apply {

            this.mess = "a"
            this.tit = "b"
        })
        return chatList
    }
}
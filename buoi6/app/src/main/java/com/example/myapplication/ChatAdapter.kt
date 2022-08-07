package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter(private val chatList: List<Chat>): RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {
    class ChatViewHolder(view: View): RecyclerView.ViewHolder(view){

        private var tv_title: TextView
        private var tv_content: TextView

        init {
            tv_title = view.findViewById<TextView>(R.id.tv_title)
            tv_content = view.findViewById<TextView>(R.id.tv_content)
        }
        fun setData(chat: Chat) {
            tv_title.text = chat.tit
            tv_content.text = chat.mess

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.setData(chatList[position])

    }

    override fun getItemCount(): Int = if( chatList.isNotEmpty()) chatList.size else 0
}



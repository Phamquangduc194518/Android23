package com.example.btvnbuoi61application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.LayoutInflaterCompat
import androidx.recyclerview.widget.RecyclerView

class FolderManagerAdapter(var dataList: ArrayList<FolderManager>) : RecyclerView.Adapter<FolderManagerAdapter.FolderManagerVH>() {

    class FolderManagerVH(view: View) : RecyclerView.ViewHolder(view) {
         var icon = view.findViewById<ImageView>(R.id.icon)
         var tvtitle: TextView= view.findViewById(R.id.tvtitle)
        var tvcontent: TextView= view.findViewById(R.id.tvcontent)

        fun setData(folderManager: FolderManager) {
            tvtitle.text = folderManager.title
            tvcontent.text = folderManager.content
            icon.setImageResource(folderManager.image)
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FolderManagerVH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_manage, parent, false)
        return FolderManagerVH(v)
    }

    override fun onBindViewHolder(holder: FolderManagerVH, position: Int) {
        holder.setData(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
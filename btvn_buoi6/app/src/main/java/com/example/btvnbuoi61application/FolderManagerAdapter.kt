package com.example.btvnbuoi61application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.LayoutInflaterCompat
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class FolderManagerAdapter(var mList: ArrayList<FolderManager>) : RecyclerView.Adapter<FolderManagerAdapter.FolderManagerViewHolder>() {
    class FolderManagerViewHolder(view:View): RecyclerView.ViewHolder(view){
        var tvtitle: TextView= view.findViewById(R.id.tvtitle)
        var tvcontent: TextView= view.findViewById(R.id.tvcontent)

        fun setData(folderManager: FolderManager){
            tvtitle.text=folderManager.title
            tvcontent.text=folderManager.content
        }

    }
    // Muốn biết lấy object, vị trí khi click vào item
    var onItemClick: ((FolderManager, Int)-> Unit)?= null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FolderManagerViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_manage, parent, false)
        return FolderManagerViewHolder(v)
    }

    override fun onBindViewHolder(holder: FolderManagerViewHolder, position: Int) {


        holder.setData(mList[position])
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(mList.get(position), position)
//            val title : String = holder.tvtitle.text.toString()
//            val content : String = holder.tvcontent.text.toString()
//            val intent : Intent = Intent(context, Man2Activity::class.java)
//            intent.putExtra("datatitle", title)
//            intent.putExtra("datacontent", content)
//            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}
package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class WishListAdapter(var List: ArrayList<WishList>): RecyclerView.Adapter<WishListAdapter.WishListVH>() {
    class WishListVH(view: View) : RecyclerView.ViewHolder(view) {
        var tvNumber: TextView = view.findViewById(R.id.number)
        var tvProduct: TextView = view.findViewById(R.id.tvNameProduct)
        var tvCost: TextView = view.findViewById(R.id.tvCost_m2)



        fun setData(wishlist: WishList) {
            tvNumber.text = wishlist.id.toString()
            tvProduct.text = wishlist.nameProduct
            tvCost.text = wishlist.cost.toString()


        }
    }
    var onItemClick: ((WishList, Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishListVH {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.wishlist_item, parent, false)
        return WishListVH(v)
    }

    override fun onBindViewHolder(holder: WishListVH, position: Int) {
        holder.setData(List[position])
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(List.get(position), position)
        }
    }

        override fun getItemCount(): Int {
            return List.size
        }
    }


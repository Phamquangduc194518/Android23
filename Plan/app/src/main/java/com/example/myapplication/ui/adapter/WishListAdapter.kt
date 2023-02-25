package com.example.myapplication.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.WishlistItemBinding
import com.example.myapplication.model.WishList
import java.util.zip.Inflater

class WishListAdapter(var list: ArrayList<WishList>) : RecyclerView.Adapter<WishListAdapter.WishListViewHolder>() {
    class WishListViewHolder( val binding: WishlistItemBinding ): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishListViewHolder {
        return WishListViewHolder( WishlistItemBinding.inflate(
            LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: WishListViewHolder, position: Int) {
        val data = list[position]
        holder.binding.tvProduct.text= data.nameProduct
        holder.binding.tvCost.text= data.cost.toString()
    }

    override fun getItemCount() = list.size
    }

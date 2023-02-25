package com.example.myapplication.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemIncomeBinding
import com.example.myapplication.model.Income

class IncomeWalletAdapter(var listIncome: ArrayList<Income>) : RecyclerView.Adapter<IncomeWalletAdapter.WalletViewHolder>() {
    class WalletViewHolder(var binding: ItemIncomeBinding ): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        return WalletViewHolder(ItemIncomeBinding.inflate(
            LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val dataWallet = listIncome[position]
        holder.binding.itemNameWallet.text= dataWallet.nameWallet
        holder.binding.itemCostWallet.text= dataWallet.costWallet.toString()
    }

    override fun getItemCount() = listIncome.size
}
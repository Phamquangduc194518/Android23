package com.example.myapplication.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemExpenditureBinding
import com.example.myapplication.model.Expenditure

class ExpenditureAdapter(var listExpenditure: ArrayList<Expenditure>) : RecyclerView.Adapter<ExpenditureAdapter.ExpenditureVH>() {
    class ExpenditureVH( var binding: ItemExpenditureBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenditureVH {
        return ExpenditureVH(ItemExpenditureBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun onBindViewHolder(holder: ExpenditureVH, position: Int) {
        val dataExpenditure = listExpenditure[position]
        holder.binding.itemNameExpenditure.text= dataExpenditure.nameExpenditure
        holder.binding.itemCostExpenditure.text= dataExpenditure.costExpenditure.toString()
    }

    override fun getItemCount() = listExpenditure.size

}
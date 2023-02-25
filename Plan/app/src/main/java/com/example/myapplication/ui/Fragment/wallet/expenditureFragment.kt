package com.example.myapplication.ui.Fragment.wallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentExpenditureBinding
import com.example.myapplication.model.Expenditure
import com.example.myapplication.ui.adapter.ExpenditureAdapter

class expenditureFragment : Fragment() {

    private lateinit var binding: FragmentExpenditureBinding
    private var expenditureAdapter: ExpenditureAdapter? = null
    private var listExpenditure = arrayListOf<Expenditure>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding= FragmentExpenditureBinding.inflate(layoutInflater, container, false)
        binding.rcvDataExpenditure.layoutManager= LinearLayoutManager(context)
        listExpenditure.add(Expenditure("lẩu", 240000))
        expenditureAdapter= ExpenditureAdapter(listExpenditure)
        binding.rcvDataExpenditure.adapter= expenditureAdapter

        return binding.root
    }

}
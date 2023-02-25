package com.example.myapplication.ui.Fragment.wallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentIncomeWalletBinding
import com.example.myapplication.model.Income
import com.example.myapplication.ui.adapter.IncomeWalletAdapter

class incomeFragment : Fragment() {

    lateinit var binding: FragmentIncomeWalletBinding
    private var walletAdapter: IncomeWalletAdapter? = null
    private var listIncome = arrayListOf<Income>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentIncomeWalletBinding.inflate(layoutInflater, container, false)
        binding.rcvDataWallet.layoutManager= LinearLayoutManager(context)
        listIncome.add(Income("Lẩu", 200000))
        walletAdapter = IncomeWalletAdapter(listIncome)
        binding.rcvDataWallet.adapter=walletAdapter

        return  binding.root
    }


}
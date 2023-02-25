package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentBlank1Binding
import com.example.myapplication.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {


    lateinit var binding: FragmentBlank2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlank2Binding.inflate(layoutInflater, container, false)
        binding.m2.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_blankFragment2_to_blankFragment3)
        }
        return binding.root
    }


}
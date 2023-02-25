package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentBlank1Binding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentBlank1Binding
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
       binding = FragmentBlank1Binding.inflate(layoutInflater, container, false)
        binding.m1.setOnClickListener {
            Navigation.findNavController(it!!).navigate(R.id.action_homeFragment_to_blankFragment2)
        }
        return binding.root
    }


}
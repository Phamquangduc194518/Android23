package com.example.myapplication.ui.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentExpenditureBinding
import com.example.myapplication.databinding.FragmentUpdateUserBinding
import com.example.myapplication.databinding.FragmentUserBinding


class UpdateUserFragment : Fragment() {

    lateinit var binding: FragmentUpdateUserBinding
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
        binding= FragmentUpdateUserBinding.inflate(layoutInflater, container, false)
        binding.tvCaNhanHoa.setOnClickListener {
            replaceFragment(UserFragment())
        }
        return binding.root
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = getParentFragmentManager()
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }
}
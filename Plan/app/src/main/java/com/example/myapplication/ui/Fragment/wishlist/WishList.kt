package com.example.myapplication.ui.Fragment.wishlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentWishListBinding
import com.example.myapplication.model.WishList
import com.example.myapplication.ui.adapter.WishListAdapter

class WishList : Fragment() {

    lateinit var binding: FragmentWishListBinding
    private var myList = arrayListOf<WishList>()
    private var wishListAdapter: WishListAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentWishListBinding.inflate(layoutInflater, container, false)
        binding.rcvData.layoutManager = LinearLayoutManager(context)
        myList.add(WishList("haha", 12000))
        wishListAdapter = WishListAdapter(myList)
        binding.rcvData.adapter=wishListAdapter



        binding.tvAddWishList.setOnClickListener {

            replaceFragment(AddWishList())
        }

        binding.tvEditWishList.setOnClickListener {

            replaceFragment(EditWishList())
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
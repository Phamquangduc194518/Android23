package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class BlankFragment1 : Fragment() {
    private var recyclerView: RecyclerView? = null
    private var wishlistAdapter: WishListAdapter? = null
    private val list: ArrayList<WishList> = ArrayList()
    private val  tvDoneA: TextView? = null

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
        return inflater.inflate(R.layout.wishlist_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView = view.findViewById(R.id.rcvData)
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = linearLayoutManager
        val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView?.addItemDecoration(dividerItemDecoration)


        list.add(WishList(1,"Máy Giặt", 1200000.0))
        list.add(WishList(1,"Máy La", 180000.0))


        wishlistAdapter = WishListAdapter(list)
        recyclerView?.adapter = wishlistAdapter

    }
}
package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivityNavigation : AppCompatActivity() {
//    private var navigation_home:

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val nav_view= findViewById<BottomNavigationView>(R.id.nav_view)
        nav_view.setOnItemSelectedListener {
            if(it.itemId==R.id.navigation_home) {
                Toast.makeText(this, "Man Hello", Toast.LENGTH_SHORT).show()
            }
            return@setOnItemSelectedListener false
        }

    }


}
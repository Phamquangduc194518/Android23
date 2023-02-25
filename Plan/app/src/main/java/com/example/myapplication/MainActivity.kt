package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.Fragment.HomeFragment
import com.example.myapplication.ui.Fragment.wallet.NewRevenueExpenditureFragment
import com.example.myapplication.ui.Fragment.UpdateUserFragment
import com.example.myapplication.ui.Fragment.UserFragment
import com.example.myapplication.ui.Fragment.wallet.incomeFragment
import com.example.myapplication.ui.Fragment.wishlist.WishList
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {


    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fab: FloatingActionButton? = findViewById(R.id.fab)
//        val navController = findNavController(R.id.fragmentContainerView)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
//        bottomNavigationView.setupWithNavController(navController)

        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false

        replaceFragment(HomeFragment())

        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menuHome -> {
                    replaceFragment(HomeFragment())
                    return@setOnItemSelectedListener true
                }

                R.id.menuWishList -> {
                    replaceFragment(WishList())
                    return@setOnItemSelectedListener true
                }

                R.id.menuWallet ->{
                    replaceFragment(incomeFragment())
                    return@setOnItemSelectedListener true
                }

                R.id.menuUser->{

                    replaceFragment(UserFragment())
                    return@setOnItemSelectedListener true
                }

                else -> {
                    return@setOnItemSelectedListener false
                }
            }
        }
        fab?.setOnClickListener {
            replaceFragment(NewRevenueExpenditureFragment())
        }

    }

        private fun replaceFragment(fragment: Fragment) {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
            fragmentTransaction.commit()
        }


}
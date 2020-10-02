package com.example.vicky.androidui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.example.vicky.androidui.R
import kotlinx.android.synthetic.main.home_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_main)
        bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }

    private val mOnNavigationItemSelectedListener =
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.item_stores -> {

                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.item_favorites -> {


                        return@OnNavigationItemSelectedListener true
                    }

                    R.id.item_orders -> {


                        return@OnNavigationItemSelectedListener true

                    }

                    R.id.item_shopping -> {


                        return@OnNavigationItemSelectedListener true

                    }

                    R.id.item_profile -> {

                        return@OnNavigationItemSelectedListener true

                    }
                }
                false
            }
}
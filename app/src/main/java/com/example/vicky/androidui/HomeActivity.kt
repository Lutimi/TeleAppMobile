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
                    R.id.item_home -> {

                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.item_recommendations -> {


                        return@OnNavigationItemSelectedListener true
                    }

                    R.id.item_status -> {
                        val fragmentTransaction = supportFragmentManager.beginTransaction()
                                .replace(
                                        R.id.frameLayoutFragment,
                                        ProcessingStatusFragment.newInstance(

                                        ),
                                      ProcessingStatusFragment.TAG
                                ).addToBackStack(ProcessingStatusFragment.TAG)
                        fragmentTransaction.commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true

                    }

                    R.id.item_city -> {


                        return@OnNavigationItemSelectedListener true

                    }

                    R.id.item_my_cars -> {

                        return@OnNavigationItemSelectedListener true

                    }
                }
                false
            }
}
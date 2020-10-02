package com.example.vicky.androidui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.home_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_main)
        bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        bottom_navigation.selectedItemId = R.id.item_home
    }

    private val mOnNavigationItemSelectedListener =
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.item_home -> {
                        val fragmentTransaction = supportFragmentManager.beginTransaction()
                                .replace(
                                        R.id.frameLayoutFragment,
                                        ListCarsFragment.newInstance(

                                        ),
                                        ListCarsFragment.TAG
                                ).addToBackStack(ListCarsFragment.TAG)
                        fragmentTransaction.commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.item_recommendations -> {

                        val fragmentTransaction = supportFragmentManager.beginTransaction()
                                .replace(
                                        R.id.frameLayoutFragment,
                                        RecomendationsFragment.newInstance(

                                        ),
                                        RecomendationsFragment.TAG
                                ).addToBackStack(RecomendationsFragment.TAG)
                        fragmentTransaction.commitAllowingStateLoss()
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

                        val fragmentTransaction = supportFragmentManager.beginTransaction()
                                .replace(
                                        R.id.frameLayoutFragment,
                                        CityFragment.newInstance(

                                        ),
                                        CityFragment.TAG
                                ).addToBackStack(CityFragment.TAG)
                        fragmentTransaction.commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true

                    }

                    R.id.item_my_cars -> {
                        val fragmentTransaction = supportFragmentManager.beginTransaction()
                                .replace(
                                        R.id.frameLayoutFragment,
                                        ImageCarsFragment.newInstance(

                                        ),
                                        ImageCarsFragment.TAG
                                ).addToBackStack(ImageCarsFragment.TAG)
                        fragmentTransaction.commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true

                    }
                }
                false
            }
}
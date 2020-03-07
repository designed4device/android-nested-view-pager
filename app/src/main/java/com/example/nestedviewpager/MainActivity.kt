package com.example.nestedviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_view_pager.adapter = MainViewPagerAdapter(
            context = this,
            fragmentManager = supportFragmentManager
        )
        main_tab_layout.setupWithViewPager(main_view_pager)
    }
}

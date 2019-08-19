package com.example.nestedviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_pager.adapter = object : FragmentStatePagerAdapter(supportFragmentManager) {

            val views = listOf(
                NestedViewPagerFragment.newInstance(),
                NestedViewPagerFragment.newInstance(),
                NestedViewPagerFragment.newInstance()
            )

            override fun getCount(): Int = views.count()

            override fun getPageTitle(position: Int): CharSequence = position.toString()

            override fun getItem(position: Int): Fragment = views[position]

        }

        tab_layout.setupWithViewPager(view_pager)

    }
}

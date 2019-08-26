package com.example.nestedviewpager

import android.graphics.Color
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

            override fun getCount(): Int = data.count()

            override fun getPageTitle(position: Int): CharSequence = data[position].title

            override fun getItem(position: Int): Fragment = NestedViewPagerFragment.newInstance(dataViews = data[position].views)

        }

        tab_layout.setupWithViewPager(view_pager)

    }

    val data = arrayListOf(
        Data(
            title = "first",
            views = arrayListOf(
                DataView(
                    color = Color.RED,
                    text = ""
                ),
                DataView(
                    color = Color.GREEN,
                    text = ""
                )
            )
        ),
        Data(
            title = "second",
            views = arrayListOf(
                DataView(
                    color = Color.RED,
                    text = ""
                ),
                DataView(
                    color = Color.GREEN,
                    text = ""
                )
            )
        ),
        Data(
            title = "third",
            views = arrayListOf(
                DataView(
                    color = Color.RED,
                    text = ""
                ),
                DataView(
                    color = Color.GREEN,
                    text = ""
                )
            )
        )
    )
}

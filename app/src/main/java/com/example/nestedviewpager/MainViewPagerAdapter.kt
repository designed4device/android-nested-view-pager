package com.example.nestedviewpager

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MainViewPagerAdapter(context: Context, fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager) {

    override fun getCount(): Int = data.count()

    override fun getPageTitle(position: Int): CharSequence = data[position].title

    override fun getItem(position: Int): Fragment =
        MainViewPagerFragment.newInstance(dataViews = data[position].views)

    private val data = arrayListOf(
        Data(
            title = "first",
            views = arrayListOf(
                DataView(
                    color = ContextCompat.getColor(context, R.color.colorPrimary),
                    message = "one"
                ),
                DataView(
                    color = ContextCompat.getColor(context, R.color.colorPrimaryDark),
                    message = "two"
                )
            )
        ),
        Data(
            title = "second",
            views = arrayListOf(
                DataView(
                    color = ContextCompat.getColor(context, R.color.colorPrimary),
                    message = "three"
                ),
                DataView(
                    color = ContextCompat.getColor(context, R.color.colorPrimaryDark),
                    message = "four"
                )
            )
        ),
        Data(
            title = "third",
            views = arrayListOf(
                DataView(
                    color = ContextCompat.getColor(context, R.color.colorPrimary),
                    message = "five"
                ),
                DataView(
                    color = ContextCompat.getColor(context, R.color.colorPrimaryDark),
                    message = "six"
                )
            )
        )
    )
}
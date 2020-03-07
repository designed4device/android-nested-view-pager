package com.example.nestedviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class NestedViewPagerAdapter(
    fragmentManager: FragmentManager,
    private val dataViews: List<DataView>
) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getCount(): Int = dataViews.count()

    override fun getItem(position: Int): Fragment =
        dataViews[position].let { dataView ->
            NestedViewPagerFragment.newInstance(
                color = dataView.color,
                message = dataView.message
            )
        }

}
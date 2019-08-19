package com.example.nestedviewpager


import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.fragment_nested_view_pager.*

class NestedViewPagerFragment : Fragment() {

    override fun onResume() {
        super.onResume()

        nested_view_pager.adapter = object : FragmentStatePagerAdapter(childFragmentManager) {

            val views = listOf(
                ViewFragment.newInstance(Color.RED),
                ViewFragment.newInstance(Color.GREEN)
            )

            override fun getCount(): Int = views.count()

            override fun getItem(position: Int): Fragment = views[position]

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nested_view_pager, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = NestedViewPagerFragment()
    }
}
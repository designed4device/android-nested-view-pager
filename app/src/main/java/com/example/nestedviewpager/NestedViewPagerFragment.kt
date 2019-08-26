package com.example.nestedviewpager


import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.fragment_nested_view_pager.*
import android.R.attr.accountType
import android.widget.RemoteViews


class NestedViewPagerFragment : Fragment() {

    private lateinit var dataViews: ArrayList<DataView>

    override fun onResume() {
        super.onResume()

        nested_view_pager.adapter = object : FragmentStatePagerAdapter(childFragmentManager) {

            override fun getCount(): Int = dataViews.count()

            override fun getItem(position: Int): Fragment = ViewFragment.newInstance(dataViews[position].color)

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataViews = arguments?.getParcelableArrayList<DataView>("data")?: arrayListOf()
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
        fun newInstance(dataViews: ArrayList<DataView>) = NestedViewPagerFragment().apply {
            arguments = Bundle().apply {
                putParcelableArrayList("data", dataViews)
            }
        }
    }
}

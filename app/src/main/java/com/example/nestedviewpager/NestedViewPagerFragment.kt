package com.example.nestedviewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_nested_view_pager.*

class NestedViewPagerFragment : Fragment() {

    private val color by lazy {
        arguments?.getInt("color")!!
    }

    private val message by lazy {
        arguments?.getString("message")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nested_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_nested_view_pager_text_view.apply {
            this.setBackgroundColor(color)
            text = message
        }
    }

    companion object {
        fun newInstance(color: Int, message: String) =
            NestedViewPagerFragment().apply {
                arguments = Bundle().apply {
                    putInt("color", color)
                    putString("message", message)
                }
            }
    }
}

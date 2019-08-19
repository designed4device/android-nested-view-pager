package com.example.nestedviewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_view.*

class ViewFragment : Fragment() {

    private var color: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            color = it.getInt("color")
        }
    }

    override fun onResume() {
        super.onResume()
        color_view?.setBackgroundColor(color)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view, container, false)
    }


    companion object {
        @JvmStatic
        fun newInstance(color: Int) =
            ViewFragment().apply {
                arguments = Bundle().apply {
                    putInt("color", color)
                }
            }
    }
}

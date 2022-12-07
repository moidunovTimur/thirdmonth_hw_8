package com.example.thirdmonth_hw_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thirdmonth_hw_8.databinding.FragmentSecond2Binding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecond2Binding
    private val surname = arrayListOf<Parametr>()
    private lateinit var name : Parametr

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecond2Binding.inflate(layoutInflater)
        return binding.root    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.titleTv.text =name.name

    }


}
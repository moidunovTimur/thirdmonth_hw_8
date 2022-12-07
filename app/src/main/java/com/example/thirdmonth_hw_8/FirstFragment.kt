package com.example.thirdmonth_hw_8

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.thirdmonth_hw_8.databinding.FragmentFirst2Binding
import com.example.thirdmonth_hw_8.databinding.Item1Binding

class FirstFragment : Fragment() {
    private val list=ArrayList<Parametr>()
    private lateinit var binding: FragmentFirst2Binding
    private  lateinit var  item: Item1Binding
    private lateinit var  adapterName: Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirst2Binding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        list.clear()
        loadData()

        adapterName = Adapter(list,this::onClick)
        binding.recycler.adapter=adapterName
    }

    fun loadData() {
        list.add(Parametr("Alive"))
        list.add(Parametr("Alive"))
        list.add(Parametr("Alive"))
        list.add(Parametr("Alive"))
        list.add(Parametr("Alive"))
    }
    private fun onClick(position:Int){
        val bundle = Bundle()
        bundle.putSerializable("key",list[position])
        findNavController().navigate(R.id.secondFragment)
    }



}
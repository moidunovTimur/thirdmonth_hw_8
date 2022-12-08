package com.example.thirdmonth_hw_8

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.thirdmonth_hw_8.databinding.FragmentFirst2Binding
import com.example.thirdmonth_hw_8.databinding.Item1Binding
import org.w3c.dom.NameList

class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirst2Binding
    var name: ArrayList<Parametr> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false)
        binding = FragmentFirst2Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterName()
        binding.recycler.adapter = adapterName()
    }

    fun click(position: Parametr) {
        findNavController().navigate(R.id.secondFragment)


    }

    fun adapterName(): RecyclerView.Adapter<*>? {

        adapterName().add(Parametr("RealMadrid"))
        adapterName().add(Parametr("Barcelona"))
        adapterName().add(Parametr("Arsenal"))
        adapterName().add(Parametr("Liverpyl"))
        adapterName().add(Parametr("ManchesterCity"))

    }


    private fun <VH : RecyclerView.ViewHolder?> RecyclerView.Adapter<VH>?.add(parametr: Parametr) {
        TODO("Not yet implemented")
    }


}









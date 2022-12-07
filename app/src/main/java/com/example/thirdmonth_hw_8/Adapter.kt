package com.example.thirdmonth_hw_8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thirdmonth_hw_8.databinding.FragmentFirst2Binding
import com.example.thirdmonth_hw_8.databinding.Item1Binding

class Adapter(val data: ArrayList<Parametr>,
              val onclick: (position: Int) -> Unit): RecyclerView.Adapter<Adapter.ViewHolder>() {

   inner class ViewHolder(private var binding : Item1Binding): RecyclerView.ViewHolder(binding.root){
       fun bind(parametr: Parametr){
           binding.tvText.text=parametr.name
           itemView.setOnClickListener {
               onclick(adapterPosition)

           }
       }
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(Item1Binding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.bind(data[position])
    }

    override fun getItemCount(): Int =data.size
}
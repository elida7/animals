package com.example.ejercicio_parte2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio_parte2.Animal
import com.example.ejercicio_parte2.R

class AnimalAdapter(private val animalesList: List<Animal>) : RecyclerView.Adapter<AnimalViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val layouInflater = LayoutInflater.from(parent.context)
        return AnimalViewHolder(layouInflater.inflate(R.layout.item_animal, parent,false))
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val item = animalesList[position]
        holder.render(item)
        //holder.render(animalesList[position])
    }

    override fun getItemCount(): Int = animalesList.size
}
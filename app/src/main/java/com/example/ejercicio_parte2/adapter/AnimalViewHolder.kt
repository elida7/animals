package com.example.ejercicio_parte2.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ejercicio_parte2.Animal
import com.example.ejercicio_parte2.AnimalesProvider
import com.example.ejercicio_parte2.R

class AnimalViewHolder(val view: View): RecyclerView.ViewHolder(view){

    val nombre = view.findViewById<TextView>(R.id.tvNombre)
    val clase = view.findViewById<TextView>(R.id.tvClase)
    val habitat = view.findViewById<TextView>(R.id.tvHabitat)
    val comida = view.findViewById<TextView>(R.id.tvComida)
    val hambre = view.findViewById<TextView>(R.id.tvHambre)
    val imagen = view.findViewById<ImageView>(R.id.ivAnimal)


    fun render(animal:Animal){
        nombre.text = animal.nombre
        clase.text = animal.clase
        habitat.text = animal.habitat
        comida.text = animal.comida
        hambre.text = animal.hambre
        Glide.with(imagen.context).load(animal.image).into(imagen)
        view.setOnClickListener {
            Toast.makeText(
                view.context,
                "Has seleccionado a ${animal.nombre}",
                Toast.LENGTH_SHORT
            ).show() }
    }
}
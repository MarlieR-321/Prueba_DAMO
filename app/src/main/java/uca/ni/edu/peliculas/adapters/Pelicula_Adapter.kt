package uca.ni.edu.peliculas.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uca.ni.edu.peliculas.R
import uca.ni.edu.peliculas.databinding.ItemPeliculaBinding
import uca.ni.edu.peliculas.entidades.Clasificacion
import uca.ni.edu.peliculas.entidades.Pelicula

class Pelicula_Adapter(val lista:List<Pelicula>):RecyclerView.Adapter<Pelicula_Adapter.PeliculaHolder>()  {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PeliculaHolder {
        val binding = ItemPeliculaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PeliculaHolder(binding)
    }

    override fun onBindViewHolder(holder: PeliculaHolder, position: Int) {
        holder.bind(lista[position])
    }

    override fun getItemCount(): Int = lista.size

    class PeliculaHolder(val binding:ItemPeliculaBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pelicula:Pelicula){
            with(binding){
                titulo.text = pelicula.titulo
                tipoMetraje.text = pelicula.tipoMetraje
                nacionalidad.text = pelicula.nacionalidad
                clasificacion.text = pelicula.clasificacion
                duracion.text = pelicula.duracion
                sinopsis.text = pelicula.sinopsis
            }
        }
    }

}
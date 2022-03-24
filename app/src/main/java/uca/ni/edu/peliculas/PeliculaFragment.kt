package uca.ni.edu.peliculas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import uca.ni.edu.peliculas.adapters.Clasificacion_Adapter
import uca.ni.edu.peliculas.adapters.Pelicula_Adapter
import uca.ni.edu.peliculas.databinding.FragmentClasificacionBinding
import uca.ni.edu.peliculas.databinding.FragmentPeliculaBinding
import uca.ni.edu.peliculas.entidades.Clasificacion
import uca.ni.edu.peliculas.entidades.Pelicula


class PeliculaFragment : Fragment() {

    lateinit var binding: FragmentPeliculaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPeliculaBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvClasificacion.layoutManager = LinearLayoutManager(context)

        val lista:ArrayList<Pelicula> = arrayListOf(
            Pelicula(1,"R","mayores de 18","Nicaraguense","grabado en ciudad sandino","cortometraje","La muerte de la llorona"),
            Pelicula(1,"R","mayores de 18","Nicaraguense","grabado en ciudad sandino","cortometraje","La muerte de la llorona"),
            Pelicula(1,"R","mayores de 18","Nicaraguense","grabado en ciudad sandino","cortometraje","La muerte de la llorona"),
            Pelicula(1,"R","mayores de 18","Nicaraguense","grabado en ciudad sandino","cortometraje","La muerte de la llorona"),
        )

        val adapter = Pelicula_Adapter(lista)
        binding.rvClasificacion.adapter = adapter
    }
}
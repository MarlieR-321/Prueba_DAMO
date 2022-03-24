package uca.ni.edu.peliculas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import uca.ni.edu.peliculas.adapters.Clasificacion_Adapter
import uca.ni.edu.peliculas.adapters.Genero_Adapter
import uca.ni.edu.peliculas.databinding.FragmentClasificacionBinding
import uca.ni.edu.peliculas.databinding.FragmentGeneroBinding
import uca.ni.edu.peliculas.entidades.Clasificacion
import uca.ni.edu.peliculas.entidades.Genero


class GeneroFragment : Fragment() {
    lateinit var binding: FragmentGeneroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGeneroBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvClasificacion.layoutManager = LinearLayoutManager(context)

        val lista:ArrayList<Genero> = arrayListOf(
            Genero(1,"Accion",true),
            Genero(2,"Comedia",true),
            Genero(3,"Drama",true),
            Genero(5,"Romantica",true)
        )

        val adapter = Genero_Adapter(lista)
        binding.rvClasificacion.adapter = adapter
    }

}
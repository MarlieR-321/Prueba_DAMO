package uca.ni.edu.peliculas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import uca.ni.edu.peliculas.adapters.Genero_Adapter
import uca.ni.edu.peliculas.adapters.Idioma_Adapter
import uca.ni.edu.peliculas.databinding.FragmentClasificacionBinding
import uca.ni.edu.peliculas.databinding.FragmentIdiomaBinding
import uca.ni.edu.peliculas.entidades.Genero
import uca.ni.edu.peliculas.entidades.Idioma


class IdiomaFragment : Fragment() {
    lateinit var binding: FragmentIdiomaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIdiomaBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvClasificacion.layoutManager = LinearLayoutManager(context)

        val lista:ArrayList<Idioma> = arrayListOf(
            Idioma(1,"Español",true),
            Idioma(2,"Ingles",true),
            Idioma(3,"Chino",true),
            Idioma(5,"Taiwanes",true)
        )

        val adapter = Idioma_Adapter(lista)
        binding.rvClasificacion.adapter = adapter
    }
}
package uca.ni.edu.peliculas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import uca.ni.edu.peliculas.adapters.Clasificacion_Adapter
import uca.ni.edu.peliculas.adapters.Nacionalidad_Adapter
import uca.ni.edu.peliculas.databinding.FragmentNacionalidadBinding
import uca.ni.edu.peliculas.entidades.Clasificacion
import uca.ni.edu.peliculas.entidades.Nacionalidad


class NacionalidadFragment : Fragment() {
    private lateinit var binding: FragmentNacionalidadBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNacionalidadBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvClasificacion.layoutManager = LinearLayoutManager(context)

        val lista:ArrayList<Nacionalidad> = arrayListOf(
            Nacionalidad(1,"Aleman",true),
            Nacionalidad(2,"Estados Unidos",true),
            Nacionalidad(3,"Mexicano",true),
            Nacionalidad(5,"Republica Dominicana",true)
        )

        val adapter = Nacionalidad_Adapter(lista)
        binding.rvClasificacion.adapter = adapter
    }
}
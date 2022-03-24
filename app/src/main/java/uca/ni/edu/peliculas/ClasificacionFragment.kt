package uca.ni.edu.peliculas

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import uca.ni.edu.peliculas.adapters.Clasificacion_Adapter
import uca.ni.edu.peliculas.databinding.FragmentClasificacionBinding
import uca.ni.edu.peliculas.entidades.Clasificacion


class ClasificacionFragment : Fragment() {

    lateinit var binding: FragmentClasificacionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentClasificacionBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvClasificacion.layoutManager = LinearLayoutManager(context)

        val lista:ArrayList<Clasificacion> = arrayListOf(
            Clasificacion(1,"R","mayores de 18",true),
            Clasificacion(2,"PG","chgiguines",true),
            Clasificacion(3,"PG-13","chiguines crecidos",true),
            Clasificacion(5,"R","mayores de 18",true)
        )

        val adapter = Clasificacion_Adapter(lista)
        binding.rvClasificacion.adapter = adapter
    }

}
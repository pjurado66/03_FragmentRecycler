package com.pjurado.a03_fragmentrecycler

import AdapterFragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.pjurado.a03_fragmentrecycler.databinding.FragmentListaBinding


class ListaFragment : Fragment() {
    private lateinit var binding: FragmentListaBinding
    private val datos: ArrayList<String> = llenaDatos()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListaBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(context)
        binding.recycler.layoutManager = layoutManager

        val adapter = AdapterFragment(datos)
        binding.recycler.adapter = adapter
    }

    private fun llenaDatos(): ArrayList<String> {
        var datos = ArrayList<String>()
        for (i in 1..20){
            datos.add("Elemento $i")
        }
        return datos
    }
}
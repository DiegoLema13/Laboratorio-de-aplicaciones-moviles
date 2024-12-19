package com.example.test0.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.test0.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflar el layout con View Binding
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configuración de los botones
        binding.btnSumar.setOnClickListener {
            val resultado = realizarOperacion("sumar")
            binding.resultado.text = "Resultado: $resultado"
        }

        binding.btnRestar.setOnClickListener {
            val resultado = realizarOperacion("restar")
            binding.resultado.text = "Resultado: $resultado"
        }

        binding.btnMultiplicar.setOnClickListener {
            val resultado = realizarOperacion("multiplicar")
            binding.resultado.text = "Resultado: $resultado"
        }

        binding.btnDividir.setOnClickListener {
            val resultado = realizarOperacion("dividir")
            binding.resultado.text = "Resultado: $resultado"
        }

        return root
    }

    private fun realizarOperacion(operacion: String): String {
        // Obtener los números desde los EditText
        val num1 = binding.num1.text.toString().toDoubleOrNull()
        val num2 = binding.num2.text.toString().toDoubleOrNull()

        // Validar entradas
        if (num1 == null || num2 == null) {
            return "Error: Ingresa números válidos"
        }

        // Realizar la operación
        return when (operacion) {
            "sumar" -> (num1 + num2).toString()
            "restar" -> (num1 - num2).toString()
            "multiplicar" -> (num1 * num2).toString()
            "dividir" -> if (num2 != 0.0) (num1 / num2).toString() else "Error: División entre 0"
            else -> "Operación no válida"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

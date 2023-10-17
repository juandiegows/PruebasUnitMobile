package com.example.pruebasunitmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pruebasunitmobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSumar.setOnClickListener {
            Toast.makeText(this, "Sumando", Toast.LENGTH_SHORT).show()
            binding.txtResultado.text = sumar(binding.txtNum1.text.toString().toInt(), binding.txtNum2.text.toString().toInt()).toString()
        }
        binding.btnRestar.setOnClickListener {
            Toast.makeText(this, "restando", Toast.LENGTH_SHORT).show()
            binding.txtResultado.text = restar(binding.txtNum1.text.toString().toInt(), binding.txtNum2.text.toString().toInt()).toString()
        }
        binding.btnDividir.setOnClickListener {
            Toast.makeText(this, "dividiendo", Toast.LENGTH_SHORT).show()
            binding.txtResultado.text = dividir(binding.txtNum1.text.toString().toInt(), binding.txtNum2.text.toString().toInt()).toString()
        }
        binding.btnMultiplicar.setOnClickListener {
            Toast.makeText(this, "multiplicado", Toast.LENGTH_SHORT).show()
            binding.txtResultado.text = multiplicar(binding.txtNum1.text.toString().toInt(), binding.txtNum2.text.toString().toInt()).toString()
        }
    }

    fun sumar(num1:Int, num2:Int):Int{
        return num1 + num2
    }

    fun restar(num1:Int, num2:Int):Int{
        return num1 - num2
    }
    fun multiplicar(num1:Int, num2:Int):Int{
        return num1 * num2
    }

    fun dividir(num1:Int, num2:Int):Int{
        if(num2 == 0){
            throw  Exception("no se puede dividir entre cero")
        }
        return num1 / num2
    }
}
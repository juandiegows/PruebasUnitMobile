package com.example.pruebasunitmobile

class Logica {
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
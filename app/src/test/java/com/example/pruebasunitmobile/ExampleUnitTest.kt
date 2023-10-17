package com.example.pruebasunitmobile

import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {


    lateinit var  logica :Logica
    @Before
    fun setUp() {
     logica = Logica()
    }

    @After
    fun tearDown() {
        // Realizar limpieza si es necesario
    }


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testSumar() {
        val resultado = logica.sumar(2, 3)
        assertEquals(5, resultado)
    }

    @Test
    fun testRestar() {
        val resultado = logica.restar(5, 2)
        assertEquals(3, resultado)
    }

    @Test
    fun testMultiplicar() {
        val resultado = logica.multiplicar(4, 3)
        assertEquals(12, resultado)
    }

    @Test
    fun testDividir() {
        val resultado = logica.dividir(10, 2)
        assertEquals(5, resultado)
    }

    @Test(expected = Exception::class)
    fun testDividirPorCero() {
        logica.dividir(5, 0)
    }

}
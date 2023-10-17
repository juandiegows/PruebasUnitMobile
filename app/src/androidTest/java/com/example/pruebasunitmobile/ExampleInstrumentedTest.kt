package com.example.pruebasunitmobile

import android.content.Intent
import androidx.lifecycle.Lifecycle
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.pruebasunitmobile", appContext.packageName)
    }
    @After
    fun tearDown() {
        // Realizar limpieza si es necesario
    }
    @get:Rule var activityScenarioRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)
    @Test
    fun testSumar() {
        activityScenarioRule.scenario.onActivity {  mainActivity ->
            val resultado = mainActivity.sumar(2, 3)
            assertEquals(5, resultado)
        }

    }
    @Test
    fun testClickSumar() {
        activityScenarioRule.scenario.moveToState(Lifecycle.State.CREATED)
        activityScenarioRule.scenario.onActivity {  mainActivity ->
            mainActivity.binding.txtNum1.setText("3");
            mainActivity.binding.txtNum2.setText("2");
            mainActivity.binding.btnSumar.callOnClick()
            assertEquals(5, mainActivity.binding.txtResultado.text.toString())
        }

    }
    @Test
    fun testRestar() {
        activityScenarioRule.scenario.onActivity {  mainActivity ->
            val resultado = mainActivity.restar(5, 2)
            assertEquals(3, resultado)
        }

    }

    @Test
    fun testMultiplicar() {
        activityScenarioRule.scenario.onActivity {  mainActivity ->
            val resultado = mainActivity.multiplicar(4, 3)
            assertEquals(12, resultado)
        }

    }

    @Test
    fun testDividir() {
        activityScenarioRule.scenario.onActivity {  mainActivity ->
            val resultado = mainActivity.dividir(10, 2)
            assertEquals(5, resultado)
        }

    }

    @Test(expected = Exception::class)
    fun testDividirPorCero() {
        activityScenarioRule.scenario.onActivity {  mainActivity ->
            mainActivity.dividir(5, 0)
        }

    }
}
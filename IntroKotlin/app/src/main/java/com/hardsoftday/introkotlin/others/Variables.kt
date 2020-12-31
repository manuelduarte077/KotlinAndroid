package com.hardsoftday.introkotlin.others

import android.util.Log

/***
 * En kotlin todo es u objeto
 *
 *  Mo hay tipos básicos, y no existe void. Si algo no devuelve nada, está devolviendo unit objet
 *  Las Variables pueden ser mutables o inmutable, usaremos simore que sea posible. (var y val )
 *  Los tipos son definidos despues del nombre de la variable, con dos puntos y espacio ( var name: tipo)
 *
 */


class Variables {

    private var variable0: Int = 1
    private var variable1 = 1.toByte()
    private var variable2 = -123
    private var variable3 = 2147483648
    private var variable4 = 1.1.toFloat()
    private var variable5 = 1.9
    private var variable6 = 'a'
    private var variable7 = "a"
    private var variable8 = true
    private var variable9 = arrayOf(1,2,3,4,5)
    private var variable10 = arrayOfNulls<Int>(10) // solo acepta enteros
    private val variable11 = "Esta variable es read-only/inmutable/constante/"

    // Show case para byte
    private fun showCase1 () {
        Log.w("VARIABLE-0", "¿Es variable0 un Integer? -->" + (variable0 is Int) + "¿por qué no un byte?" )
        Log.w("VARIABLE-1", "¿Es variable1 un byte? -->" + (variable1 is Byte))
    }

    // Show case para Int
    private fun showCase2 () {
        Log.w("VARIABLE-2", "¿Es un valor Integer")
        variable2 = Int.MAX_VALUE
    }

    // Show Case para Long
    private fun showCase3() {
        Log.w("VARIABLE-3", "¿Es un valor Long? --> " + (variable3 is Long))
    }

    // Show Case para Float
    private fun showCase4() {
        Log.w("VARIABLE-4", "¿Es un valor Float? --> " + (variable4 is Float))
    }

    // Show Case para Double
    private fun showCase5() {
        Log.w("VARIABLE-5", "¿Es un valor Double? --> " + (variable5 is Double))
    }

    // Show Case para Char
    private fun showCase6() {
        Log.w("VARIABLE-6", "¿Es un valor Char? --> " + (variable6 is Char))
    }

    // Show Case para String
    private fun showCase7 () {
        Log.w("VARIABLE-7", "¿Es un valor String? --> " + (variable7 is String))

        // String Literales
        variable7 = "¡Hola Mundo!\n¡Adiós Mundo!" // Java's style

        variable7 = """
                    ¡Hola Mundo!
                    ¡Adiós Mundo!
                    """        // Kotlin's style
        // String Templates
        var points  = 9
        var maxPoints = 10

        variable7 = "Hola, tengo " + points + " puntos sobre" + maxPoints // Java's style
        variable7 = "Hola, tengo $points puntos sobre $maxPoints" // Kotlin's style
        variable7 = "Hola, tengo ${points + maxPoints} puntos sobre $maxPoints" // Kotlin's style

    }

    // Show Case para Booleano
    private fun showCase8 () {
        Log.w("VARIABLE-8", "¿Es un valor Booleano? --> " + (variable8 is Boolean))
    }

    // Show Case para Array<Int>
    private fun showCase9 () {
        Log.w("VARIABLE-9", "¿Es un valor Array<Int>? --> " + (variable9 is Array<Int>))
    }

    // Show Case para Array<Int>
    private fun showCase10() {
        Log.w("VARIABLE-10", "¿Es un valor Array<String>? --> " + (variable10 is Array<Int?>))

        variable10 = arrayOfNulls(3)
        variable10 = arrayOf(1,2,3,4,5)

        variable10[10]?.toFloat() // Safe Calls - En caso de ser null, devuelve null (llamadas seguras)
        variable10[10]?.toFloat() ?: "Error" // Elvis operator - En caso de ser null, devuelve "Error"
        variable10[10]!!.toFloat() // The !! Operator --  Cuando estamos seguros que no es nulo al 100%, si lo fuera,lanza un null pointer exception

    }

    fun showCases() {

        showCase1()
        showCase2()
        showCase3()
        showCase4()
        showCase5()
        showCase6()
        showCase7()
        showCase8()
        showCase9()
        showCase10()
    }


}
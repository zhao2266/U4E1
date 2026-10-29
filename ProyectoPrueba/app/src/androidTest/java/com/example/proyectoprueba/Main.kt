package com.example.proyectoprueba

fun main() {
    print("Introduce la cantidad en miligramos: ")
    val miligramos = readLine()!!.toInt()

    if (miligramos > 100) {
        println("¡Felicidades, es una buena poción!")
    } else {
        println("La poción es mediocre, sangre sucia inmunda")
    }
}
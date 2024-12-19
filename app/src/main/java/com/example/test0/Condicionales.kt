package com.example.test0

// Tarea 2.- Usando When coloque su cumpleaños.

fun main() {
    // Pedir al usuario el número del mes
    println("Ingresa el número del mes (1-12):")
    val mes = readLine()?.toIntOrNull()

    // Validacion de la entrada
    if (mes == null || mes !in 1..12) {
        println("Por favor, ingresa un número válido entre 1 y 12.")
        return
    }

    // Uso de when para determinar el nombre del mes
    val nombreMes = when (mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Mes desconocido"
    }

    // Mostrarmos el mensaje dependiendo del mes
    if (mes == 7) {
        println("¡Felicidades! Julio es el mes de mi cumpleaños.")
    } else {
        println("El mes ingresado es: $nombreMes, pero no es tu cumpleaños.")
    }
}

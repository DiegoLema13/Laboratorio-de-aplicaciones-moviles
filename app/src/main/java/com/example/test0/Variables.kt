package com.example.test0

// Tarea 1.- Hacer la resta, multiplicación, división (validación), módulo y suma en lenguaje Kotlin

fun main() {
    // Pedir números al usuario
    println("Ingresa el primer número:")
    val num1 = readLine()?.toDoubleOrNull()

    println("Ingresa el segundo número:")
    val num2 = readLine()?.toDoubleOrNull()

    // Validamos la entrada de los números
    if (num1 == null || num2 == null) {
        println("Por favor, ingresa números válidos.")
        return
    }

    // Operaciones
    val suma = num1 + num2
    val resta = num1 - num2
    val multiplicacion = num1 * num2

    // Validamos la división y módulo
    println("Resultados:")
    println("Suma: $suma")
    println("Resta: $resta")
    println("Multiplicación: $multiplicacion")
    if (num2 != 0.0) {
        val division = num1 / num2
        val modulo = num1 % num2
        println("División: $division")
        println("Módulo: $modulo")
    } else {
        println("No se puede dividir ni calcular el módulo entre 0.")
    }
}

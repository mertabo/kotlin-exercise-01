package utilities.math

import kotlin.math.min
import kotlin.math.sqrt

fun getFactorial(number: Int): Int = (1..number).fold(1) { accumulator, current -> accumulator * current }

fun isPrime(number: Int): Boolean {
    for (n in 2..sqrt(number.toDouble()).toInt()) {
        if (number % n == 0) {
            return false
        }
    }

    return true
}

fun getFibonacciTerm(term: Int): Int {
    if (term <= 1) {
        return term
    }

    var previous = 0
    var current = 1

    for (index in 1 until term) {
        val next = previous + current
        previous = current
        current = next
    }

    return current
}

fun getSumOfDigits(number: Int): Int {
    var total = 0
    var current = number

    while (current > 0) {
        total += current % 10
        current /= 10
    }

    return total
}

fun findGCD(number1: Int, number2: Int): Int {
    var current = min(number1.toDouble(), number2.toDouble()).toInt()

    while (current > 0) {
        if (number1 % current == 0 && number2 % current == 0) {
            return current
        }

        current -= 1
    }

    return 0
}

fun convertCelsiusToFahrenheit(celsius: Int): Double = (celsius * 9.0 / 5.0) + 32

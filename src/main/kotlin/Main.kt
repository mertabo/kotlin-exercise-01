import kotlin.math.min
import kotlin.math.sqrt

fun main() {
   println("Factorial of 8 is ${getFactorial(8)}")
   println("Check if 2 is a prime number: ${isPrime(2)}")
   println("String: Hello world, Reversed string: ${reverseString("Hello world")}")
   println("Max element of [1, 2, 3]: ${getMaxElement(arrayOf(1, 2, 3))}")
   println("5th term in the fibonacci sequence: ${getFibonacciTerm(5)}")
   println("Check if kayak is a palindrome: ${isPalindrome("kayak")}")
   println("Sum of the digits of 123: ${getSumOfDigits(123)}")
   println("GCD of 12 and 3: ${findGCD(12, 3)}")
   println("Number of vowels in 'abcdef': ${countVowels("abcdef")}")
   println("37 celsius in fahrenheit: ${convertCelsiusToFahrenheit(37)}")
}

fun getFactorial(number: Int): Int = (1..number).fold(1) { accumulator, current -> accumulator * current }

fun isPrime(number: Int): Boolean {
   for (n in 2..sqrt(number.toDouble()).toInt()) {
      if (number % n == 0) {
         return false
      }
   }

   return true
}

fun reverseString(string: String): String = string.reversed()

fun<T: Comparable<T>> getMaxElement(array: Array<T>): T? = array.maxOrNull()

fun getFibonacciTerm(term: Int): Int {
   if (term <= 1) {
      return term
   }

   var previous = 0
   var current = 1

   for (index in 2 until term) {
      val next = previous + current
      previous = current
      current = next
   }

   return current
}

fun isPalindrome(string: String): Boolean {
   for (index in 0..string.length / 2) {
      if (string[index] != string[string.length - index - 1]) {
         return false
      }
   }

   return true
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

   while (current > 1) {
      if (number1 % current == 0 && number2 % current == 0) {
         return current
      }

      current -= 1
   }

   return 1
}

fun countVowels(string: String): Int = string.toList().fold(0) { accumulator, current -> accumulator + if (current.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')) 1 else 0 }

fun convertCelsiusToFahrenheit(celsius: Int): Double = (celsius * 9.0 / 5.0) + 32

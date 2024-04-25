import utilities.comparable.*
import utilities.math.*
import utilities.string.*

fun main() {
   println("Factorial of 8 is ${getFactorial(8)}")
   println("Check if 2 is a prime number: ${isPrime(2)}")
   println("String: Hello world, Reversed string: ${reverseString("Hello world")}")
   println("Max element of [1, 2, 3]: ${getMaxElement(arrayOf(1, 2, 3))}")
   println("Fibonacci(5): ${getFibonacciTerm(5)}")
   println("Check if kayak is a palindrome: ${isPalindrome("kayak")}")
   println("Sum of the digits of 123: ${getSumOfDigits(123)}")
   println("GCD of 12 and 3: ${findGCD(12, 3)}")
   println("Number of vowels in 'abcdef': ${countVowels("abcdef")}")
   println("37 celsius in fahrenheit: ${convertCelsiusToFahrenheit(37)}")
}

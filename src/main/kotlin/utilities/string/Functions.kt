package utilities.string

fun reverseString(string: String): String = string.reversed()

fun isPalindrome(string: String): Boolean {
    for (index in 0..string.length / 2) {
        if (string[index] != string[string.length - index - 1]) {
            return false
        }
    }

    return true
}

fun countVowels(string: String): Int = string
    .lowercase()
    .toList()
    .fold(0) { accumulator, current -> accumulator + if (current in listOf('a', 'e', 'i', 'o', 'u')) 1 else 0 }


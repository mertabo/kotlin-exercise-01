package utilities.comparable

fun<T: Comparable<T>> getMaxElement(array: Array<T>): T? = array.maxOrNull()

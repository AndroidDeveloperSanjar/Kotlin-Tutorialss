fun main() {
    val numbers = listOf(1, 2, 3, 7, 8, 9, 0)
    println(numbers.filter(::isOdd))
}

fun isOdd(x: Int) = x % 2 != 0
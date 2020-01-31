package course5

fun main() {
    val max = getMax6(12, 2)
    println(max)
}

fun getMax6(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
    println("This will not be printed")
}
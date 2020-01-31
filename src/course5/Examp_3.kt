package course5

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6)

    println(getSum(10, 20, *array, 30, b = 40))
}

fun getSum(a: Int, vararg numbers: Int, b: Int): Int {
    var sum = a + b

    for (number in numbers) sum += number

    return sum
}
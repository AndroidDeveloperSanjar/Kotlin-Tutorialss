package course5

fun main() {
    println(getMax(14, 100, 9))
    println(getMax(3,9))
    println(getMax(6.5,5.5))
}

fun getMax(a: Int, b: Int) = if (a > b) a else b

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int) =
    when {
        a >= b && a >= c -> a
        b >= a && b >= c -> b
        else -> c
    }


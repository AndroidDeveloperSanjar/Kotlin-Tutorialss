package course5

const val STRING_CONSTANT = "I am a constant"

fun main() {
    println(STRING_CONSTANT)

    println(getMax(900, 800, 50, 10, 11, 2))
}

fun getMax(first: Int, vararg remaining: Int): Int {
    println(STRING_CONSTANT)

    var max = first

    for (i in remaining) {
        if (i > max) max = i
    }

    return max
}
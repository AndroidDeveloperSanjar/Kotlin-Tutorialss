package course5

fun main() {
    greet(
        "How are you?",
        name = "Hans",
        reps = 4
    )
}

fun greet(message: String, name: String = "User", reps: Int = 2) {
    for (i in 0 until reps) println("Hello, $name! $message")
}
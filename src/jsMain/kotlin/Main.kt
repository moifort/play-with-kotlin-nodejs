fun greetMessage(): String {
    val message = listOf("Hello", "from", "Kotlin", "on", "Node.js!")
    return "Hello from Kotlin on Node.js! $message"
}

fun main() {
    println(greetMessage())
}

package org.example

fun main() {
    hello()
    println(sum(1, 2))
    printMessageWithPrefix(message = "Hello", prefix = "Log")
    printMessageWithPrefix(message = "Hello")
    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("hello"))
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubled)
    println(tripled)

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
}

fun hello() {
    return println("Hello, world!")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

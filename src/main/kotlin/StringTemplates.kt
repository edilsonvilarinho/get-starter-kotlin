package org.example

fun main() {

    val customers = 10

    println(" There are $customers customers")
    println(" There are ${customers + 1} customers")

    practiceStringTemplates()
}

private fun practiceStringTemplates() {
    val name = "Mary"
    val age = 20

    println(" $name is $age years old ")
}
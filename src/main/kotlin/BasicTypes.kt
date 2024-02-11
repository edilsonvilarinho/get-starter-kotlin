package org.example

fun main() {

    var customers = 10

    customers = 8
    customers = customers + 3
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3

    println(customers)

    //Integers
    var b: Byte
    var s: Short
    var i: Int
    var l: Long

    //Unsigned integers
    var ub: UByte
    var us: UShort
    var ui: UInt
    var ul: ULong

    //Floating-point numbers
    var f: Float
    var d: Double

    //Booleans
    var bo: Boolean

    //Characters
    var c: Char

    //Strings
    var st: String

    practiceBasicTypes()
}

private fun practiceBasicTypes() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}
package org.example

/*
Collection type
Lists Ordered collections of items
Sets  Unique unordered collections of items
Maps Sets of key-value pairs where keys are unique and map to only one value
*/
fun main() {
    list()
    set()
}


private fun list() {

    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    val shapesLocked: List<String> = shapes
    println(shapesLocked)

    println("the first item the list ${readOnlyShapes[0]}")
    println("the first item the list ${readOnlyShapes.first()}")
    println("the last item the list ${readOnlyShapes.last()}")
    println("the list ${readOnlyShapes.count()}")
    println("circle" in readOnlyShapes)

    shapes.add("pentagon")
    println(shapes)
    shapes.remove("pentagon")
    println(shapes)
}

private fun set() {
    val readOnlyFruit = setOf("apple", "banana", "cherry")
    val fruit: MutableList<String> = mutableListOf("apple", "banana", "cherry")

    println(readOnlyFruit)

    fruit.add("dragonfruit")
    println(fruit)
    fruit.remove("dragonfruit")
    println(fruit)

    println("This set has ${readOnlyFruit.count()} items")
}
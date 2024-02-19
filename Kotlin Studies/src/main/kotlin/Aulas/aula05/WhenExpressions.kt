package br.com.bruno.section4.aula02

fun main() {

    val pizzasOrdered = 7

    when (pizzasOrdered) {
        0 -> println("Not Hungry")
        1 -> println("Hungry")
        2 -> println("Very Hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        0 -> println("We need orders")
        in 1 .. 4  -> println("Got some orders")
        in 5 .. 9 -> println("Business is up")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("ordered less than 0 pizzas. Invalid!")
    }

    when {
        pizzasOrdered <= 0 -> println("none ordered")
        pizzasOrdered % 2 != 0 -> println("Odd number of pizzas ordered")
        pizzasOrdered % 2 == 0 -> println("Even number of pizzas ordered")
    }

}




package br.com.bruno.section4.aula02

fun main() {

    val myInt = 199
    val aInt: Int = 7

//    int lowest = (myint < aInt) ? myInt : aInt


    val lowest = if(myInt < aInt) myInt else aInt

    val temp = 26
    val isAirConditionerOn = if (temp >= 26) {
        println("It is warm")
        true
    } else {
        println("Not so warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")

}
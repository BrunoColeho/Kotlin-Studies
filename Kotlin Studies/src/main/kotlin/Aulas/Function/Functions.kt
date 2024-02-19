package Aulas.Function

fun main () {
//    println("10 + 20 = ${myMathFunction(10, 20)}")
//    println("15 + 25 = ${myExpressionBodyFunction(15, 25)}")
//    println("18 + 32 = ${myExpressionBodyFunctionWithInference(15, 25)}")
    println("10 + 10 = ${myFunctionWithDefaults(10, 10)}")
    println("10 + 10 = ${myFunctionWithDefaults(10, 10, "Hello")}")

}

fun myMathFunction(number1: Int, number2: Int) : Int {
    return number1 + number2
}

fun myExpressionBodyFunction (number1: Int, number2: Int) : Int = number1 + number2

// aqui eu nao preciso dar o tipo da saída, ele vai inferir pelos argumentos
fun myExpressionBodyFunctionWithInference (number1: Int, number2: Int) = number1 + number2


fun myFunctionWithDefaults (number1: Int = 1, number2: Int = 5, message: String = "Hi") : Int {
    val result = number1 + number2
    println(message)
    return result
}
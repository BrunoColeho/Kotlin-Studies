package Aulas.FizzBuzz

fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()

    for (it in 1..n) {
        val item = when {
            //First the 'fizzbuzz', or it will fall on the other logics and scape the fizzbuzz scope
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return list
}


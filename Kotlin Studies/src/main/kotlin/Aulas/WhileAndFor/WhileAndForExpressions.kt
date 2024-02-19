fun main() {

//    var x = 0
//    while (x<10) {
//        println("x = $x")
//        x += 3
//    }
//
//    //utilizando o do while
//
//    do {
//        println("x = $x")
//        x-= 3
//    } while (x>0)
//
//
//    //via de regra a variável criada dentro do for é um VAL, então é imutável e não é possível mudar o valor.
//    for (item in 1..10) {
//        println("$item,")
//
//    }
//
//    // posso mandar iterar até mesmo sobre uma palavra!
//    for (ch in "Bruno"){
//        println(ch)
//    }

//    var index = 0
//    //vai ignorar todos os ímpares com o step 2
//    for (item in 10.rangeTo(20).step(2)) {
//        println("${++index} ) $item, ")
//    }
//    println()

//    for ((indx, item) in 10.rangeTo(20).step(2).withIndex()) {
//        println("${indx + 1} ) $item, ")
//    }
//
//    println()

    val myArray = arrayOf(10, 20, 30, 40, 50)
    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }

    println()

}
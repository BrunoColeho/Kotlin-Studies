package Aulas.Generics


//tipo T é pra indicar que é um parâmetro do tipo genérico

fun <T: Comparable<T>> Max(param1: T, param2: T) : T{
    val result = param1.compareTo(param2)
    return if (result > 0) param1 else param2
}
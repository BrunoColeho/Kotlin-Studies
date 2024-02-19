package Aulas.Generics

fun main() {

    val maxInt : Int = Max(42, 99)
    val maxLong : Long = Max(123_456_789L, 999_999_999L)
    val maxByte : Byte = Max((-128).toByte(), (127).toByte())
    val maxString : String = Max("Alpha", "Omega")


    println("The max int = $maxInt")
    println("The max Long = $maxLong")
    println("The max Byte = $maxByte")
    println("The max String = $maxString")
}
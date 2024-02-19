package Aulas.Interfaces

interface vehicle {

    val automakerName : String

    fun start() {
        println("Vrummm")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter() : Int {
        return 13
    }

    fun getDoors() : Int
}
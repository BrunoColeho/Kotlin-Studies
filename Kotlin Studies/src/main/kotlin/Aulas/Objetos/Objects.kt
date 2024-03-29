package Aulas.Objetos

fun main() {

    val location1 = object {
        var xCoordinate = 200
        var yCoordinate = 400
    }

    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")


    val location = object {
        var xCoordinate = 300
        var yCoordinate = 600
        fun printIt(){
            println("Coordinates = ($xCoordinate, $yCoordinate)")

        }
    }

    location.printIt()

    location.xCoordinate = 3000
    location.yCoordinate = 6000

    location.printIt()


    val temperature = mySingleton.getLastTemperature()
    print("Last temperature measured = $temperature degrees")
}

object mySingleton {
    var temperatures = arrayOf(18, 22, 26)
    fun getLastTemperature() = temperatures.last()
}
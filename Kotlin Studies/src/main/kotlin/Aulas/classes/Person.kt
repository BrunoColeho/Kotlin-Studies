package Aulas.classes

//class Person constructor (firstName: String, lastName: String) {
class Person internal constructor (firstName: String, lastName: String) {


    init {
        println("Created a new Person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName, lastName)

}
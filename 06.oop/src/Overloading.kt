class Animal() {
    var name: String ? = null
    var color: String ? = null
    var leg: Int ? = null

    constructor(name: String, color: String, leg: Int): this() {
        this.name = name
        this.color = color
        this.leg = leg

        println("The name is: " + this.name)
        println("The color is: " + this.color)
        println("It has: " + this.leg + " legs.")
    }

    constructor(name: String, color: String): this() {
        this.name = name
        this.color = color

        println("The name is: " + this.name)
        println("The color is: " + this.color)
    }

    fun showName() {
        println("The animal name is: " + this.name)
    }
}

fun main(args: Array<String>) {
    var animal = Animal("Lion", "Yellow", 4);
    animal.showName()

    var otherAnimal = Animal()
    otherAnimal.name = "Tiger"
    otherAnimal.showName()

}
open class Person() {
    var name: String ? = null // public
    private var color: String ? = null
    protected var height: Double ? = null

    // initializes all the of out properties
    constructor(name: String, color: String, height: Double): this() {
        this.name = name
        this.color = color
        this.height = height

        println("Name is : $name")
        println("Color is : $color")
        println("Height is : $height")
    }

    constructor(name: String, color: String): this() {
        this.name = name
        this.color = color

        println("Name is : $name")
        println("Color is : $color")
    }

    open fun hello() {
        println("Hi There!")
    }
}

class Jayanta: Person {
    var weight: Double = 0.0
    var color: String ? = null

    constructor(name: String, color: String): super() {
        super.name = name
        // super.color = color // error (private property)

        this.color = color
        this.weight = 53.50

        println(super.name)
        println(this.weight)
    }

    constructor(): super() {
        super.height = 6.8
    }

    override fun hello() {
        println("I am neo.")
    }
}

fun main(args: Array<String>) {
    var person = Person("Jayanta Biswas", "Blue", 5.7)
    var jayanta = Jayanta("Jayanta", "Yellow")

    // println(person.height) // error
    println(jayanta.hello())

}
open class Car() {
    var model: String ? = null
    var color: String ? = null
    var rank: Float ? = null

    constructor(model: String, color: String, rank: Float): this() {
        this.model = model
        this.color = color
        this.rank = rank

        println("The model is: " + this.model)
        println("Car color is: " + this.color)
        println("Rank of the car is: " + this.rank)
    }
}

// inheritance
class Bmw: Car() {
    var price: Double ? = null

}

fun main(args: Array<String>) {
    var car = Car("B87", "Blue", 4.5f)

    var bmw = Bmw()
    bmw.model = "M65"
    println("BMW car model is: " + bmw.model)
}

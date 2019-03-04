class House(type: String, price: Double, builtIn: Int, owner: String) {
    var type: String ? = null
    var price: Double ? = null
    var builtIn: Int ? = null
    var owner: String ? = null

    // initializes all the of out properties
    init {
        this.type = type
        this.price = price
        this.owner = owner
        this.builtIn = builtIn

        // println("Type: $type")
    }

    fun GetType(): String? {
        return this.type
    }

    fun SetType(type: String) {
        this.type = type
    }
}

fun main(args: Array<String>) {
    var myHouse = House("3 Bed room house", 23000.00, 1978, "Neo");
    var secHouse = House("6 Bed room house", 123000.00, 2016, "Bonni");

    myHouse.owner = "Jayanta"

    println(myHouse.owner)
    println(secHouse.price)

    myHouse.SetType("8 Bad room house")
    println(myHouse.GetType())

    // println("My house $myHouse");
}
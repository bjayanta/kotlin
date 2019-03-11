fun main(args: Array<String>) {
    // default is always immutable
    // var myArrayList = listOf<String>("Me", "Neo", "Maruf", "Arif", "Suman")
    // var myArrayList = listOf("Me", 105, "Maruf", "Arif", "Suman")
    var myArrayList = listOf<Any>("Me", 101, "Maruf", "Arif", "Suman")

    println(myArrayList)
    println(myArrayList[1])

    for (item in myArrayList) {
        println(item)
    }

    // make it mutable
    var myArrayList2 = mutableListOf<Any>("Me", 101, "Maruf", "Arif", "Suman")

    // add
    myArrayList2[0] = "Unknown"
    println(myArrayList2)

    // Hashmap
    var myHashmap = hashMapOf(1 to "Neo", 2 to "Maruf", 3 to "Arif")
    println(myHashmap)
    println(myHashmap.get(2))

    // array
    var myArray = arrayOf(1, 2, "Hello", 3, 100)
    myArray[0] = 500

    for (i in myArray) {
        println(i)
    }
}
fun main(args: Array<String>) {
    var myArray = ArrayList<String> ()
    myArray.add("Jayanta")
    myArray.add("Maruf")
    myArray.add("Suman")
    myArray.add("Imran")
    myArray.add("Joy")

    myArray.set(1, "Arif")

    // remove
    myArray.remove("Maruf")

    // iterating through objects
    for(name in myArray) {
        println("Names: " + name)
    }

    for(index in 0..myArray.size - 1) {
        println("Items: " + myArray.get(index))
    }

    // in array
    if (myArray.contains("Joy")) println("He is a good boy.")

    println("Array " + myArray.get(0))
}


fun main(args: Array<String>) {
    var myArray = Array<Int> (5){2}
    myArray[0] = 10
    myArray[1] = 1
    myArray[2] = 3
    myArray[3] = 8
    myArray[4] = 100

    // print objects
    for (element in myArray) {
        // println("Index is " + element + " Items: " + myArray[element])
        println("Items: " + element)
    }

    // print items inside of the array via index
    // for (index in 0..5-1) {
    for (index in 0..myArray.size - 1) {
        println(myArray[index])
    }

    // println(myArray[1])
}
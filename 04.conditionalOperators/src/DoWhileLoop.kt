fun main(args: Array<String>) {

    var counter = 0

    do {
        if(counter % 3 == 0) println("Yes") else println("No")

        counter++
    } while (counter < 5)

    println("Out of while loop.")
}
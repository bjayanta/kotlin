fun main(args: Array<String>) {

    print("Enter a number between 1 - 5: ")
    var input = readLine()!!.toInt()

    when(input) {
        1 -> println("Jayanta Biswas")
        2 -> println("Maruf Hasan")
        3 -> println("Imran Sajjad")
        4 -> println("Ariful Islam")
        5 -> println("Suman Raj")
        else -> {
            println("Sorry, You are way lost!")
        }
    }
}
// var myName = "Ruman Rajvohr"
var myName: String ? = null

fun main(args: Array<String>) {
    // myName = "Jaynata Biswas" // local variable
    showName("Jayanta")
}

fun showName(name: String) {
    myName = "Neo"

    myName = "Neo"
    println("Name: $myName")
}
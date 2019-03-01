fun main(args: Array<String>) {
    println("What is your name?")
    var name = readLine()
    println("Your name is $name")

    var age = readLine()!!.toInt()
    println("After 1 years later you will be ${age + 1}")
}
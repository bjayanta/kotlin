fun main(args: Array<String>) {
    var num1 = 5
    var num2 = 6
    var num3 = 10

    if((num1 > num2) && (num3 > num1)) println("Yes") else println("No")
    if((num1 > num2) || (num3 > num1)) println("Yes") else println("No")
    if((num1 > num2) ||  !(num3 > num1)) println("Yes") else println("No")
}
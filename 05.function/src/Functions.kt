fun main(args: Array<String>) {
    println("Hello")
    println(multiply(2, 3))

    var res = multiply(2, 3)
    var result = res / divide(2)

    println("The result is: $result")
}

fun multiply(num1: Int, num2: Int): Int {
    var res = num1 * num2;
    return res
}

fun divide(num1: Int): Int {
    return num1
}
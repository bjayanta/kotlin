fun main(args: Array<String>) {
    var isTrue: Boolean = false

    do {
        println("How many sun have on our solar system?")
        var ans: Int = readLine()!!.toInt()

        when(ans) {
            1 -> {
                println("You are correct!!")
                isTrue = true
            }
        }
    } while (!isTrue)
}
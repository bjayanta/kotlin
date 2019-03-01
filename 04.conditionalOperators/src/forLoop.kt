fun main(args: Array<String>) {

    for (i in 0..20) {
        if(i % 2 == 0) {
            println("$i is divisible by 2")
        } else if(i % 3 == 0) {
            println("$i is divisible by 3")
        }
    }
}
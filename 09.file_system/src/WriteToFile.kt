import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    println("Enter a message")
    var message = readLine().toString()

    if(message.equals("")) {
        println("Please enter a message")
    } else {
        writeToFile(message)
    }

}

fun writeToFile(message: String) {
    try {
        var writer = FileWriter("message.txt", true);
        writer.write(message + "\n")
        writer.close()

    } catch (ex: Exception) {
        println("Exception $ex")
    }

}
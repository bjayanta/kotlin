import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    menu()
}

fun menu() {
    println("Enter: ")
    println("1 - Write ")
    println("2 - Read ")
    println("3 - Exit ")

    var choice = readLine()!!.toInt()
    var message: String?

    when(choice) {
        1 -> {
            println("Enter message: ")
            message = readLine().toString()

            writeFile(message)
        }

        2 -> {
            println("Reading ...")
            readFile()
        }

        3 -> println("Exiting ...")
    }
}

fun writeFile(message: String) {
    try {
        var writer = FileWriter("project.txt", true);
        writer.write(message + "\n")
        writer.close()

    } catch (ex: Exception) {
        println("Exception $ex")
    }
}

fun readFile() {
    var reader = FileReader("project.txt")
    var char: Int?

    try {

        do {
            char = reader.read()
            print(char.toChar())

        } while (char != -1)

    } catch (ex: Exception) {
        print(ex.message)
    }
}
import java.io.FileReader

fun main(args: Array<String>) {
    readFromFile()
}

fun readFromFile() {
    var reader = FileReader("message.txt")
    var char: Int?

    try {

        do {
            char = reader.read()
            // print(char.toChar())
            println(char.toChar())

        } while (char != -1)

    } catch (ex: Exception) {
        print(ex.message)
    }
}

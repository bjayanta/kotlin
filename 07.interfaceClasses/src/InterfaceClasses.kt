
// interface
interface InputHelper {

    fun clicked()
    fun dblClick()
}

// implement interface
class Button: InputHelper {
    override fun dblClick() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clicked() {
        println("Button clicked!")
    }

}

class Phone: InputHelper {
    override fun dblClick() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clicked() {
        println("Phone is ringing!")
    }
}

fun main(args: Array<String>) {
    var myButton = Button()
    myButton.clicked()

    var myPhone = Phone()
    myPhone.clicked()
}

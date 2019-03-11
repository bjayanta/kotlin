
// abstract class
abstract class GraphicObject {
    fun moveTo(x: Int, y: Int) {
        println("Move to new (X, Y) = ($x, $y).")
    }

    abstract fun draw()
    abstract fun resize()
}

class Circle: GraphicObject() {
    override fun draw() {
        println("Drawing Circle.")
    }

    override fun resize() {
        println("Resizing Circle.")
    }
}

class Triangle: GraphicObject() {
    override fun draw() {
        println("Drawing Triangle.")
    }

    override fun resize() {
        println("Resizing Triangle.")
    }
}

fun main(args: Array<String>) {
    var circle = Circle()
    circle.draw()
    circle.moveTo(12, 23)

    var triangle = Triangle()
    triangle.draw()
}


class Login<T> (name: T, password: T) {
    init {
        println("Name: " + name + ", Password: " + password)
    }
}

class Person(username: String, password: String) {
    var username: String? = null
    var password: String? = null

    init {
        this.username = username
        this.password = password
        
        println("Person class initialize.")
    }
}

fun main(args: Array<String>) {
    var login = Login<String> ("Jayanta", "123456")
    var login2 = Login<Int> (12, 23)
    var login3 = Login<Boolean> (true, false)

    var person = Person("username", "password")
    var user = Login<Person> (person, person)
}

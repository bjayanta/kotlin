
enum class Suits {
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

enum class  Directions {
    North,
    South,
    East,
    West
}

fun main(args: Array<String>) {
    var cardPlayer = Suits.DIAMONDS
    var cardPlayer2 = Suits.CLUBS

    if(cardPlayer == Suits.DIAMONDS) println("You are doing great!")
    if(cardPlayer2 == Suits.CLUBS) println("Hello there! Things are not so well.")

    var playerDirections = Directions.East
    if(playerDirections == Directions.East) {
        println("You are going Eastbound.")
    }
}

package final

/*
data class Fish(
        val name:String
)

fun main() {
    val myFish = listOf(
            Fish("Flipper"),
            Fish("Moby Dick"),
            Fish("Dory")
    )

    val printed = myFish.filter { it.name.contains("i") }
            .joinToString ("\n"){ it.name }
    println(printed)
}*/

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game {
    val path = mutableListOf(Directions.START)
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = {
        /*if(path.add(Directions.END)){
            println("Game Over: $path")
            path.clear()
            println(path)

        }*/



        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false


    }

    fun move(where: () -> Boolean ) {
        where.invoke()
    }

    fun makeMove(command:String?) {
        if (command.equals("n")) move(north)
        else if (command.equals("s")) move(south)
        else if (command.equals("e")) move(east)
        else if (command.equals("w")) move(west)
        else move(end)
    }

}

fun main() {
    val newGame = Game()
    println(newGame.path)
    newGame.north()
    newGame.south()
    newGame.east()
    newGame.west()
    newGame.end()
    println(newGame.path)

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        newGame.makeMove(readLine())
    }
}


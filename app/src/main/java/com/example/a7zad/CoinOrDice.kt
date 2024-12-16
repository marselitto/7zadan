package com.example.a7zad

interface RollingTool{
    fun roll(): String
}

class Dice : RollingTool{
    override fun roll(): String{
        return (1..6).random().toString()
    }
}

class Coin : RollingTool{
    override fun roll(): String {
        return when((1..2).random()) {
            1 -> "Heads"
            2 -> "Tails"
            else -> "Błąd"
        }
    }
}

fun CoinOrDice() {
    println("Wybierz, czym chcesz rzucić:")
    println("1 - Kostką")
    println("2 - Monetą")

    val choice = readLine()?.toInt()

    val pick: RollingTool = when (choice) {
        1 -> Dice()
        2 -> Coin()
        else -> {
            println("Nieprawidłowy wybór")
            return
        }
    }
    println("Wynik rzutu: ${pick.roll()}")
}

fun main(){
    CoinOrDice()
}


package com.example.a7zad
import kotlin.random.Random

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

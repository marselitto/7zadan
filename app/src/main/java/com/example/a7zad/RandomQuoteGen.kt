package com.example.a7zad
import kotlin.random.Random

object Quotes{
    val quotes = mutableListOf(
        "Czytanie książek to najpiękniejsza zabawa, jaką sobie ludzkość wymyśliła",
        "Życie jest jak pudełko czekoladek - nigdy nie wiesz, co ci się trafi.",
        "Pozbierać jest się dziesięć razy trudniej, niż rozsypać.",
        "Najpiękniejszych chwil w życiu nie zaplanujesz. One przyjdą same",
        "Każdy człowiek powinien żyć tak, by stanowić wzór dla innych. "
    )

    fun randomQuote(): String{
        return quotes[Random.nextInt(quotes.size)]
    }

    fun addQuote(quote: String) {
        quotes.add(quote)
        println("Dodano nowy cyctat: $quote")
    }
}

fun main(){
    while(true){
        println("Wybierz opcje: ")
        println("1 - wyswietl losowy cytat")
        println("2 - dodaj nowy cytat")
        println("3 - wyjdz")
        print("Wybor: ")

        when(readLine()){
            "1" -> {
                println("Losowy cytat: ")
                println(Quotes.randomQuote())
            }
            "2" -> {
                println("Podaj nowy cytat: ")
                val newQuote = readLine()
                Quotes.addQuote(newQuote.toString())
            }
            "3" -> {
                break
            }
            else -> {
                println("Blad")
            }
        }
    }
}
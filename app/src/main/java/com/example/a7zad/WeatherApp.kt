package com.example.a7zad

interface Weather {
    fun forecast(): String
}

class Sunny : Weather{
    override fun forecast(): String = "Dzisiaj jest slonecznie"
}

class Rainy : Weather{
    override fun forecast(): String = "Dzisiaj pada deszcz"
}

class Cloudy : Weather{
    override fun forecast(): String = "Dzisiaj jest pochmurno"
}

class Windy : Weather{
    override fun forecast(): String = "Dzisiaj jest wietrznie"
}

data class City(val name: String, val weather: Weather)

fun main(){
    val cities = listOf(
        City("Warszawa", Windy()),
        City("Londyn", Rainy()),
        City("Miami", Sunny()),
        City("Krakow", Cloudy())
    )

    println("Wybierz miasto, aby zobaczyc prognoze pogody: ")
    cities.forEach{city -> println(" - ${city.name}") }

    println("Podaj nazwe miasta: ")
    val choice = readLine()
    val choiceOfCity = cities.find{it.name.equals(choice)}

    if(choiceOfCity != null){
        println("Prognoza pogody dla ${choiceOfCity.name}: ")
        println(choiceOfCity.weather.forecast())
    }
    else {
        println("Nie znaleziono miasta o podanej nazwie")
    }

}

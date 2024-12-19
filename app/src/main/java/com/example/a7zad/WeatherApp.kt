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



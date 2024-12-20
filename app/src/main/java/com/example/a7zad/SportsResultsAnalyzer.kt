package com.example.a7zad

class SportsResultsAnalyzer{
    val matchScore = mutableListOf<Int>()

    fun addScore(score: Int) {
        matchScore.add(score)
    }

    fun filterScore(threshold: Int): List<Int>{
        return matchScore.filter {it > threshold}
    }

    fun addBonusPoints(bonus: Int): List<Int>{
        return matchScore.map {it + bonus}
    }

    fun sumScore(): Int{
        return matchScore.sum()
    }

    fun maxScore(): Int{
        return matchScore.max()
    }

    fun scoreDifference(): Int {
        val maxScore = matchScore.max()
        val minScore = matchScore.min()
        return maxScore - minScore
    }

    fun countMatches(threshold: Int): Int{
        return matchScore.count {it > threshold}
    }
}

fun main(){
    val sportsResultsAnalyzer = SportsResultsAnalyzer()

    println("Wprowadz wyniki meczow. Wpisz 'koniec' aby zakonczyc")

    while (true){
        val input = readLine()

        if (input == "koniec"){
            break
        }

        val scores = input?.toInt()
        if(scores != null){
            sportsResultsAnalyzer.addScore(scores)
            println("Dodano wynik: $scores")
        }
        else {
            println("Blad, nieprawidlowy wynik")
        }
    }
    println("Podsumowanie: ")
    println("Wprowadzone wyniki: ${sportsResultsAnalyzer.filterScore(0)}")
    println("Suma wynikow: ${sportsResultsAnalyzer.sumScore()}")
    println("Maksymalny wynik: ${sportsResultsAnalyzer.maxScore()}")
    println("Roznica miedzy maksymalnym a minimalnym wynikiem: ${sportsResultsAnalyzer.scoreDifference()}")
}
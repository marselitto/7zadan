package com.example.a7zad

class SportsResultsAnalyzer{
    val matchScore = mutableListOf<Int>()

    fun addScore(score: Int) {
        matchScore.add(score)
    }

    fun filterScore(threshold: Int): List<Int>{
        return matchScore.filter {it > threshold}
    }


}
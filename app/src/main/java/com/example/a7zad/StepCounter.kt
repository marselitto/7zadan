package com.example.a7zad

class StepCounter{
    companion object{
        var steps: Int = 0
    }

    fun takeStep(){
        steps++
    }

    fun resetSteps(){
        steps = 0
    }
}

fun main(){
    val stepCounter = StepCounter()

    stepCounter.takeStep()
    stepCounter.takeStep()
    stepCounter.takeStep()
    stepCounter.takeStep()

    println("Liczba krokow: ${StepCounter.steps}")

    stepCounter.resetSteps()

    println("Liczba krokow po resecie: ${StepCounter.steps}")
}

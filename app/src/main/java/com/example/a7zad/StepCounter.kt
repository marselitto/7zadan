package com.example.a7zad

class StepCounter{
    companion object{
        var steps: Int = 0
    }

    fun takeStep(){
        steps++;
    }

    fun resetSteps(){
        steps = 0
    }
}

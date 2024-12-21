package com.example.a7zad

interface Question {
    fun askQuestion(): String
    fun checkAnswer(answer: String): Boolean
}

class MultipleChoiceQuestion(val questionText: String, val options: List<String>, val correctOption: Int) : Question {
    override fun askQuestion(): String {
        var askQuestion = "$questionText"
        for (i in options.indices) {
            askQuestion += "${i + 1}. ${options[i]}"
        }
        return askQuestion
    }

    override fun checkAnswer(answer: String): Boolean {
        return answer.toInt() == correctOption
    }
}

fun main(){

}

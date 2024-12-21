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

class TrueFalseQuestion(val questionText: String, val correctAnswer: Boolean) : Question {
    override fun askQuestion(): String {
        return "$questionText (Prawda/Fałsz)"
    }

    override fun checkAnswer(answer: String): Boolean {
        return when (answer.lowercase()) {
            "prawda" -> correctAnswer
            "fałsz" -> !correctAnswer
            else -> false
        }
    }
}

fun main() {
    println("Witaj w quizie!")
    val questions: List<Question> = listOf(
        MultipleChoiceQuestion(
            "Jaka barwa powstanie z połączenia czerwonego i niebieskiego?",
            listOf("brązowy", "fioletowy", "różowy", "czarny"),
            2
        ),

        TrueFalseQuestion(
            "Rio de Janeiro to stolica Brazylii",
            false
        ),
        MultipleChoiceQuestion(
            "Co ile lat występuje rok przestępny?",
            listOf("co dwa", "co trzy", "co cztery", "co pięć"),
            3
        ),
        TrueFalseQuestion(
            "Czy Wielki Mur Chiński widać z kosmosu?",
            false
        )
    )

    var score = 0
    for ((index, question) in questions.withIndex()) {
        println("Pytanie ${index + 1}:")
        println(question.askQuestion())
        print("Twoja odpowiedz: ")
        val userAnswer = readLine().toString()

        if (question.checkAnswer(userAnswer)) {
            println("Poprawna odpowiedz!")
            score++
        } else {
            println("Niepoprawna odpowiedz.")
        }
    }
}

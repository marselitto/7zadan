package com.example.a7zad

data class Book(val title: String, val author: String, val year: Int)

class FavouriteBookTracker{
    private val booksList = mutableListOf<Book>()

    fun addBook(title: String, author: String, year: Int){
        booksList.add(Book(title, author, year))
        println("Dodano ksiazke: $title autorstwa $author z $year roku")
    }
}

package com.example.a7zad

data class Book(val title: String, val author: String, val year: Int)

class FavouriteBookTracker{
    private val booksList = mutableListOf<Book>()

    fun addBook(title: String, author: String, year: Int){
        booksList.add(Book(title, author, year))
        println("Dodano ksiazke: $title autorstwa $author z $year roku")
    }

    fun displayBooks() {
        if(booksList.isEmpty()){
            println("Lista ksiazek jest pusta")
        }
        else {
            println("Lista twoich ulubionych ksiazek:")
            booksList.forEach{ println("${it.title}, autor: ${it.author} - ${it.year}") }
        }
    }

    fun filterByAuthor(author: String){
        val filteredBooks = booksList.filter{it.author.equals(author)}
        if(filteredBooks.isEmpty()){
            println("Brak ksiazek $author na liscie")
        }
        else {
            println("Ksiazki: $author")
            filteredBooks.forEach{ println("${it.title}")}
        }
    }
}

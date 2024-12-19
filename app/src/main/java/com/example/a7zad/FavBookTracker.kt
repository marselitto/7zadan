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

    fun filterByYear(year: Int){
        val filteredBooks = booksList.filter{it.year == year}
        if(filteredBooks.isEmpty()){
            println("Brak ksiazek z $year na liscie")
        }
        else{
            println("Ksiazki z $year")
            filteredBooks.forEach{println("${it.title}, - ${it.author}")}
        }
    }

    fun sortByTitle() {
        val sortedBooks = booksList.sortedBy{it.title}
        if(sortedBooks.isEmpty()){
            println("Lista jest pusta")
        }
        else{
            println("Posortowana alfabetycznie lista:")
            sortedBooks.forEach{println("${it.title} - ${it.year} - ${it.author}")}
        }
    }

}
fun main(){

    val favBooks = FavouriteBookTracker()

    while(true){
        println("Co chcialbys zrobic?")
        println("1 - Dodaj ksiazke")
        println("2 - Wyswietl wszystkie ksiazki")
        println("3 - Filtruj ksiazki wg. autora")
        println("4 - Filtruj ksiazki wg. roku wydania")
        println("5 - Posortuj ksiazki po tytule")
        print("Wybor")

        when(readLine()?.toInt()){
            1 -> {
                println("Podaj tytul: ")
                val title = readLine()
                println("Podaj autora: ")
                val author = readLine()
                println("Podaj rok: ")
                val year = readLine()?.toInt()
                if (title != null && author != null && year != null) {
                    favBooks.addBook(title, author, year)
                }
            }
            2 -> {
                favBooks.displayBooks()
            }
            3 -> {
                println("Podaj autora: ")
                val author = readLine().toString()
                favBooks.filterByAuthor(author)
            }
            4 -> {
                println("Podaj rok wydania: ")
                val year = readLine()?.toInt()
                if(year != null){
                    favBooks.filterByYear(year)
                } else {
                    println("Nieprawidlowy rok")
                }

            }
            5 -> favBooks.sortByTitle()
            else -> println("Blad")
        }
    }
}
package sample.remote

class Book {
    String title
    Date releaseDate
    String ISBN
    String summary

    static constraints = {
        summary maxSize: 1024
    }
}

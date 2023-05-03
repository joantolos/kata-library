package com.joantolos.library;

public class Book {

    private final String title;
    private final String author;
    private final String isbn;
    private final String publisher;

    public Book(String title, String author, String isbn, String publisher) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public boolean isAvailable() {
        return false;
    }

    public boolean borrowBook(Member member) {
        return false;
    }

    public boolean returnBook(Member member) {
        return false;
    }
}

package com.joantolos.library;

import java.util.ArrayList;
import java.util.List;

public class Member implements Observer {

    private String name;
    private String id;
    private String email;
    private List<Book> borrowedBooks;

    public Member(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }

    public boolean hasBorrowedBook(Book book) {
        return borrowedBooks.contains(book);
    }

    @Override
    public void update(Subject s) {
        if (s instanceof Book) {
            Book book = (Book) s;

            if (!book.isAvailable() && hasBorrowedBook(book)) {
                removeBorrowedBook(book);
            } else if (book.isAvailable() && !hasBorrowedBook(book)) {
                addBorrowedBook(book);
            }
        }
    }
}

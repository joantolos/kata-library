package com.joantolos.library;

import java.util.Map;

public class Library implements Observer {

    Map<String, Book> books;
    Map<String, Member> members;

    public boolean isAvailable(String isbn) {
        return books.get(isbn).isAvailable();
    }

    public boolean borrowBook(String isbn, String idMember) {
        Book book = books.get(isbn);
        Member member = members.get(idMember);

        return book.borrowBook(member);
    }

    public boolean returnBook(String isbn, String idMember) {
        Book book = books.get(isbn);
        Member member = members.get(idMember);

        return book.returnBook(member);
    }

    @Override
    public void update(Subject s) {
        Book book = (Book) s;
        System.out.println("The book " + book.getTitle() + " with ISBN " + book.getIsbn() + " is now " + (book.isAvailable() ? "available" : "unavailable"));
    }
}

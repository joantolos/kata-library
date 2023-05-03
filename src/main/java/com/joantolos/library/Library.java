package com.joantolos.library;

import java.util.Map;

public class Library {

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
}

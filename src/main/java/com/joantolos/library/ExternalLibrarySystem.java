package com.joantolos.library;

public interface ExternalLibrarySystem {
    BookData getInfo(String isbn);
    void borrow(String isbn, String email);
    void returnBook(String isbn, String email);
}

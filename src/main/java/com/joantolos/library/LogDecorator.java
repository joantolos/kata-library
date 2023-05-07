package com.joantolos.library;

public abstract class LogDecorator implements ExternalLibrarySystem {
    private ExternalLibrarySystem externalLibrary;

    LogDecorator(ExternalLibrarySystem externalLibrary) {
        this.externalLibrary = externalLibrary;
    }

    @Override
    public BookData getInfo(String isbn) {
        log("S'ha cridat a getInfo() amb el paràmetre isbn: " + isbn);
        return this.externalLibrary.getInfo(isbn);
    }

    @Override
    public void borrow(String isbn, String email) {
        log("S'ha cridat a borrow() amb isbn: " + isbn + " i email: " + email);
        this.externalLibrary.borrow(isbn, email);
    }

    @Override
    public void returnBook(String isbn, String email) {
        log("S'ha cridat a returnBook() amb isbn: " + isbn + " i email: " + email);
        this.externalLibrary.returnBook(isbn, email);
    }

    private void log(String s) {
        System.out.println(s);
    }
}

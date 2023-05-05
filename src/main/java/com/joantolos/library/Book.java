package com.joantolos.library;

import java.util.ArrayList;
import java.util.List;

public class Book extends Subject {

    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private List<Observer> observers;
    private boolean available;
    private Member borrower;

    public Book(String title, String author, String isbn, String publisher) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.available = true;
        this.observers = new ArrayList<>();
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
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        notifyObservers();
    }

    public Member getBorrower() {
        return borrower;
    }

    public void setBorrower(Member borrower) {
        this.borrower = borrower;
    }

    public boolean borrowBook(Member member) {
        if (available) {
            setAvailable(false);
            setBorrower(member);
            member.addBorrowedBook(this);
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBook(Member member) {
        if (member == borrower) {
            setAvailable(true);
            setBorrower(null);
            member.removeBorrowedBook(this);
            return true;
        } else {
            throw new RuntimeException("This book was not borrowed by this member.");
        }
    }

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        super.removeObserver(o);
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

package com.joantolos.library;

public class ExternalBook extends Book {

    private final BookData bookData;
    public ExternalBook(BookData bookData) {
        super(bookData.getTitle(), bookData.getAuthorName(), bookData.getIsbnNumber(), bookData.getPublisher().getPublisherName());
        this.bookData = bookData;
    }

    public BookData getBookData() {
        return bookData;
    }
}

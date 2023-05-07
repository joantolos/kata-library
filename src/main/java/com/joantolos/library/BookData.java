package com.joantolos.library;

public class BookData {
    private final String isbnNumber;
    private final String authorName;
    private final String title;
    private final PublisherData publisher;

    public BookData(String isbnNumber, String authorName, String title, PublisherData publisher) {
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.title = title;
        this.publisher = publisher;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    public PublisherData getPublisher() {
        return publisher;
    }
}

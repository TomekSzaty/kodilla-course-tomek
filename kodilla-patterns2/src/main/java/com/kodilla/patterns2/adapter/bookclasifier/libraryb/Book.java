package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class Book {

    private final String author;
    private final String title;
    private final int yearOfPublishing;

    public Book(String author, String title, int yearOfPublishing) {
        this.author = author;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
}

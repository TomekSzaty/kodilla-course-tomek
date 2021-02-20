package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends PrototypeLibrary<Library> {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "     Library: [" + name + "]\n";
        for (Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBooks : books) {
            Book clonedBooks = new Book(theBooks.getTitle(),
                    theBooks.getAuthor(),
                    theBooks.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBooks);
        }
        return clonedLibrary;
    }
}

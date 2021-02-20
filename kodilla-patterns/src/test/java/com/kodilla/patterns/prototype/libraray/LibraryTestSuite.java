package com.kodilla.patterns.prototype.libraray;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library number 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(3)
                .forEach(n -> library.getBooks().add(new Book("Titles", "Authors", LocalDate.now())));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //When
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), clonedLibrary.getBooks());
    }
}

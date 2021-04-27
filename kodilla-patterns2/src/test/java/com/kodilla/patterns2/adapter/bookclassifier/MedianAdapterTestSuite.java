package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    void testPublicationYearMedianTest() {
        //Given
        Set<Book> testSetBooks = new HashSet<>();
        testSetBooks.add(new Book("TestAuthor1", "TestTitle1", "SIG1",1900));
        testSetBooks.add(new Book("TestAuthor2", "TestTitle2", "SIG2",1950));
        testSetBooks.add(new Book("TestAuthor3", "TestTitle3", "SIG3",2000));
        testSetBooks.add(new Book("TestAuthor4", "TestTitle4", "SIG4",2010));
        testSetBooks.add(new Book("TestAuthor5", "TestTitle5", "SIG5",2020));


        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(testSetBooks);
        //Then
        assertEquals(2000, median);

    }
}

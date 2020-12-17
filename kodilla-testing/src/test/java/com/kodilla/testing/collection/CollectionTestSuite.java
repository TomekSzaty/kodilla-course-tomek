package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.Assert;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when use method on empty List, " +
            "then should return empty list"    )
    @Test
    void testCaseOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + listNumbers);

        //Then
        Assert.assertEquals(emptyList, listNumbers);

    }

    @DisplayName("when use method on normal List, " +
            "then should return  exterminate contents of list" )
    @Test
    void testCaseOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> oddList = new ArrayList<>(Arrays.asList(2, 4, 6));

        //When
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing " + listNumbers);

        //Then
        Assert.assertEquals(oddList, listNumbers);
    }
}

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

    @Test
    void testCaseOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();

        //When
        ArrayList<Integer>listNumbers = OddNumbersExterminator.exterminate(emptyList);
            System.out.println("Testing" + listNumbers);

        //Then
        Assert.assertEquals(emptyList, listNumbers);

    }


    @Test
    void testCaseOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer>list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer>oddList = new ArrayList<Integer>(Arrays.asList(2,4,6));

        //When
        ArrayList<Integer>listNumbers = OddNumbersExterminator.exterminate(list);
            System.out.println("Testing" + listNumbers);

        //Then
        Assert.assertEquals(oddList, listNumbers);
    }
}

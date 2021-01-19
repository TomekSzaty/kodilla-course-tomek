package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[]{20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,};

        //When
         double average =  ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(10.5, average);
    }
}

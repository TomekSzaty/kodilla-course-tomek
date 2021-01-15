package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;


public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {

        IntStream numbersOfArray = IntStream.range(numbers[0], numbers.length + 1);
            numbersOfArray.forEach(System.out ::println);

        OptionalDouble averageOfArray = IntStream.range(numbers[0], numbers.length + 1)
                .average();

        return averageOfArray;
    }
}



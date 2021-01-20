package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillNotThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When&Then
        assertDoesNotThrow(()-> secondChallenge.probablyIWillThrowException(1.9, 1.4));
    }

    @Test
    void testWhenWrongNumbersProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When&Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.0, 0.0));
    }

    @Test
    void testNumbersProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When&Then
        assertAll(
                ()->assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(10.0, 20.0)),
                ()->assertDoesNotThrow(()-> secondChallenge.probablyIWillThrowException(1.9, 1.4)));
    }

}

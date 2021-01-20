package com.kodilla.exception.test;

import java.lang.ArithmeticException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException(" NIE DZIEL PRZEZ ZERO");
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Exception!!:  " + e.getMessage());

        } finally {
            System.out.println("Result of a divide is above. ");
        }
    }
}

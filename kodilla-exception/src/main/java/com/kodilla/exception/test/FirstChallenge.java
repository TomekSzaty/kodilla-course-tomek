package com.kodilla.exception.test;

import java.lang.ArithmeticException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException("Dzielnik NIE MOZE BYC ZERO");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exeption!!:  " + e.getMessage());
        } finally {
            System.out.println("Result of a divide between " + a + " and " + b + " is: ");
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}

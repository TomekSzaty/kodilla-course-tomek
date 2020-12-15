package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.SimleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimleUser simleUser = new SimleUser("theForumUser");

        String result = simleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }
        //kolejny test
        System.out.println("Test - pierwszy test jednostkowy");
            Calculator calculator = new Calculator(5, 5);

            int resultAdd = calculator.add(5, 5);
            if (resultAdd == 10) {
                System.out.println("Calculator is OK");
            } else {
                System.out.println("Calculator is broken");
            }

        //kolejny test
        System.out.println("Test - drugi test jednostkowy");

            int resultSubtract = calculator.subtract(5, 5);
            if (resultSubtract == 0) {
                System.out.println("Calculator is OK");
            } else {
                System.out.println("Calculator is broken");
            }


    }
}

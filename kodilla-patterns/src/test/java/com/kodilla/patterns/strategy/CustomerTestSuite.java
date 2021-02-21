package com.kodilla.patterns.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTestSuite {
    @Test
    void testDefaultInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven");
        Customer john = new IndividualYoungCustomer("John");
        Customer kodilla = new CorporateCustomer("Kodilla");
        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should  " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should " + kodillaShouldBuy);
        //Then
        assertEquals("[Conservative predictor] buy debentures of ABC", stevenShouldBuy);
        assertEquals("[Aggressive predictor] by stock of XYZ ", johnShouldBuy);
        assertEquals("[Balanced predictor] buy shared units of Found WTF", kodillaShouldBuy);
    }

    @Test
    void testIndividualInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should " + stevenShouldBuy);
        steven.setBuyingStrategy(new AggressivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should " + stevenShouldBuy);

        //Then
        assertEquals("[Aggressive predictor] by stock of XYZ ", stevenShouldBuy);
    }
}

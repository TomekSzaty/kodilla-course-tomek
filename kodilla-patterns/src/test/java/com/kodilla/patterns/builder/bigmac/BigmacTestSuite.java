package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Roll")
                .burgers("Double")
                .sauce("Garlic")
                .ingredient("Cheese")
                .ingredient("Peperoni")
                .ingredient("Shrimp")
                .build();
        System.out.println(bigmac);
        ///When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);

    }
}

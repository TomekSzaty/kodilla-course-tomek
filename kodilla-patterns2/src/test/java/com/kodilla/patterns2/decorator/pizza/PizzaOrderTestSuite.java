package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza dough with tomato sauce ", description);

    }

    @Test
    void testClassicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaClassicOrderDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }

    @Test
    void testClassicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaClassicOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza dough with tomato sauce plus ham and cheese ", description);
    }

    @Test
    void testDoublePizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaDoubleOrderDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    void testDoublePizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaDoubleOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza dough with tomato sauce plus double dough, double ham and double cheese ", description);
    }

    @Test
    void testExtraPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaExtraOrderDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    void testExtraPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaExtraOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza dough with tomato sauce and Tiger shrimps and Greeks olives ", description);
    }

    @Test
    void testClassicPizzaDoubleExtraOrderWithGarlicSauceGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaClassicOrderDecorator(pizzaOrder);
        pizzaOrder = new PizzaDoubleOrderDecorator(pizzaOrder);
        pizzaOrder = new PizzaExtraOrderDecorator(pizzaOrder);
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(70), theCost);
    }
    @Test
    void testClassicPizzaDoubleExtraOrderWithGarlicSauceGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaClassicOrderDecorator(pizzaOrder);
        pizzaOrder = new PizzaDoubleOrderDecorator(pizzaOrder);
        pizzaOrder = new PizzaExtraOrderDecorator(pizzaOrder);
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());
        //When
        String description  = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza dough with tomato sauce plus ham and cheese plus double dough," +
                " double ham and double cheese and Tiger shrimps and Greeks olives additional garlic sauce ", description);
    }
}

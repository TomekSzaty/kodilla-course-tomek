package com.kodilla.patterns2.facade.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {

    BigDecimal getCost();

    String getDescription();

}

package com.kodilla.patterns2.facade.decorator.pizza;

import java.math.BigDecimal;

public class PizzaExtraOrderDecorator extends AbstractPizzaOrderDecorator{
    public PizzaExtraOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 10
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ "and Tiger shrimps and Greeks olives ";
    }
}

package com.kodilla.patterns2.facade.decorator.pizza;

import java.math.BigDecimal;

public class PizzaDoubleOrderDecorator extends AbstractPizzaOrderDecorator {
    public PizzaDoubleOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 25
        return super.getCost().add(new BigDecimal(25));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ "plus double dough, double ham and double cheese ";
    }
}

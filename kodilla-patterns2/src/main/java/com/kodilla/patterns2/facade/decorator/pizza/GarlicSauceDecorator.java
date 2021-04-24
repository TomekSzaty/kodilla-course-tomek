package com.kodilla.patterns2.facade.decorator.pizza;

import java.math.BigDecimal;

public class GarlicSauceDecorator extends AbstractPizzaOrderDecorator{
    public GarlicSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "additional garlic sauce ";
    }
}

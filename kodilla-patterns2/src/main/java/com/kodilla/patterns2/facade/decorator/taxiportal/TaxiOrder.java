package com.kodilla.patterns2.facade.decorator.taxiportal;

import java.math.BigDecimal;

public interface TaxiOrder {
    BigDecimal getCost();
    String getDescription();

}

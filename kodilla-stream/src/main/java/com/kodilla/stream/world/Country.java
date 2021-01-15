package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country (final String countryName, final BigDecimal peopleQuantity){
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName) &&
                Objects.equals(getPeopleQuantity(), country.getPeopleQuantity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, getPeopleQuantity());
    }
}


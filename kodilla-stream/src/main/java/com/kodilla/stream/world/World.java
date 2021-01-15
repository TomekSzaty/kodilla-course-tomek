package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World  {

    private final List<Continent> listContinentsWorld = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return listContinentsWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return listContinentsWorld.stream()
                .flatMap(c -> c.getListCountryOnContinents().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));
    }

}

package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent  {

    private final String continentName;
    private final List<Country> listCountryOnContinents = new ArrayList<>();

    public Continent (final String continentName){
        this.continentName = continentName;
    }

    public List<Country> getListCountryOnContinents (){
        return new ArrayList<>(listCountryOnContinents);
    }

    public boolean addCountryName (Country country){
        return listCountryOnContinents.add(country);
    }
}

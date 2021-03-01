package com.kodilla.good.patterns.chalenges.flights;

import java.util.Arrays;
import java.util.List;

class FlightsRepository {
    public final List<Flight> getFlightAirports() {
        Flight flight1 = new Flight("A1101", "Gdańsk", "Warszawa", true);
        Flight flight2 = new Flight("A1202", "Warszawa", "Gdańsk", true);
        Flight flight3 = new Flight("B1303", "Wroclaw", "Gdańsk", true);
        Flight flight4 = new Flight("B1404", "Gdańsk", "Wroclaw", true);
        Flight flight5 = new Flight("C1505", "Wroclaw", "Warszawa", true);
        Flight flight6 = new Flight("C1606", "Warszawa", "Wroclaw", true);

        return Arrays.asList(flight1, flight2, flight3, flight4, flight5, flight6);
    }
}


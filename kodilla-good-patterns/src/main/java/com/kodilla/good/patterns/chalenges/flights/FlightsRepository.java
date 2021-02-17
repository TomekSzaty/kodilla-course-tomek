package com.kodilla.good.patterns.chalenges.flights;

import java.util.Arrays;
import java.util.List;

class FlightsRepository {
    public final List<FlightAirports> getFlightAirports() {
        FlightAirports flightAirports1 = new FlightAirports("A1101", "Gdańsk", "Warszawa", true);
        FlightAirports flightAirports2 = new FlightAirports("A1202", "Warszawa", "Gdańsk", true);
        FlightAirports flightAirports3 = new FlightAirports("B1303", "Wroclaw", "Gdańsk", true);
        FlightAirports flightAirports4 = new FlightAirports("B1404", "Gdańsk", "Wroclaw", true);
        FlightAirports flightAirports5 = new FlightAirports("C1505", "Wroclaw", "Warszawa", true);
        FlightAirports flightAirports6 = new FlightAirports("C1606", "Warszawa", "Wroclaw", true);

        return Arrays.asList(flightAirports1, flightAirports2, flightAirports3, flightAirports4, flightAirports5, flightAirports6);
    }
}


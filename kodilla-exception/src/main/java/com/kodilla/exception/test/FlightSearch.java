package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("New York", true);
        airports.put("Los Angeles", false);
        airports.put("Sydney", true);

        if (airports.containsKey(flight.getArrivalAirport()) &&
                (airports.containsKey(flight.getDepartureAirport())) &&
                (airports.get(flight.getArrivalAirport())) &&
                (airports.get(flight.getDepartureAirport()))) {

             System.out.println("Have a nice flight");

        } else throw new RouteNotFoundException();

        return false;
    }
}

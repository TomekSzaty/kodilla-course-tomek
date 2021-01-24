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
                (airports.get(flight.getDepartureAirport())) && airports.containsValue(true)) {
            return true;
        } else if (airports.containsValue(false)||airports.isEmpty()) {
            throw new RouteNotFoundException();

        } else throw new RouteNotFoundException();
    }
}

package com.kodilla.good.patterns.chalenges.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        List<Flight> flightDeparture = flightService.retrieveFlightFrom("Gdańsk");
        System.out.println(flightDeparture);
        List<Flight> flightArrival = flightService.retrieveFlightTo("Gdańsk");
        System.out.println(flightArrival);
        List<Flight>flightMiddleAirportsList = flightService.retrievePossibleFlight("Gdańsk","Wroclaw");
        System.out.println(flightMiddleAirportsList);
    }
}

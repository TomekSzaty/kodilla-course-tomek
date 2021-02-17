package com.kodilla.good.patterns.chalenges.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        List<FlightAirports> flightAirportsDeparture = flightService.retrieveFlightFrom("Gdańsk");
        System.out.println(flightAirportsDeparture);
        List<FlightAirports> flightAirportsArrival = flightService.retrieveFlightTo("Gdańsk");
        System.out.println(flightAirportsArrival);
        List<FlightAirports>flightMiddleAirportsList = flightService.retrievePossibleFlight("Gdańsk","Wroclaw");
        System.out.println(flightMiddleAirportsList);
    }
}

package com.kodilla.good.patterns.chalenges.flights;

import java.util.Map;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        FlightsList flightsList = new FlightsList();
        Set<Map.Entry<FlightAirports, FlightsTime>> departureFlights = flightsList.getFlightParameters().entrySet();
        departureFlights.stream()
                .filter(e -> e.getKey().isAvailable())
                .map(e -> e.getKey().getDepartureAirport() + " - " +
                        e.getValue().getTimeDeparture() + " to " +
                        e.getKey().getArrivalAirport() + " - " +
                        e.getValue().getTimeArrivals() + " " +
                        e.getKey().isAvailable())
                .filter(e -> e.startsWith("Wro"))
                .forEach(System.out::println);

        System.out.println();

        Set<Map.Entry<FlightAirports, FlightsTime>> arrivalFlights = flightsList.getFlightParameters().entrySet();
        arrivalFlights.stream()
                .filter(e -> e.getKey().isAvailable())
                .map(e -> e.getKey().getArrivalAirport() + "-" +
                        e.getValue().getTimeArrivals() + " from: " +
                        e.getKey().getDepartureAirport() + ": " +
                        e.getKey().getNumberFlight() + " -- " +
                        e.getValue().getTimeDeparture())
                .filter(e -> e.startsWith("War"))
                .forEach(System.out::println);
    }
}

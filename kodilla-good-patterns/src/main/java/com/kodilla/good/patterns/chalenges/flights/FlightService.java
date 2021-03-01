package com.kodilla.good.patterns.chalenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private FlightsRepository flightsRepository;

    public FlightService() {
        this.flightsRepository = new FlightsRepository();
    }

    public List<Flight> retrieveFlightFrom(String departureAirport) {
        return this.flightsRepository.getFlightAirports().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> retrieveFlightTo(String arrivalAirport) {
        return this.flightsRepository.getFlightAirports().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> retrievePossibleFlight(String departureAirport, String arrivalAirport) {
        List<Flight> resultList = new ArrayList<>();
        List<Flight> flightsFromDepartureAirport = retrieveFlightFrom(departureAirport);
        for (Flight flight : flightsFromDepartureAirport) {
            String possiblyChangeAirport = flight.getArrivalAirport();
            for (Flight secondFlight : retrieveFlightFrom(possiblyChangeAirport)) {
                if (secondFlight.getArrivalAirport().equals(arrivalAirport)) {
                    resultList.add(flight);
                    resultList.add(secondFlight);
                }
            }
        }
        return resultList;
    }
}

package com.kodilla.good.patterns.chalenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private FlightsRepository flightsRepository;

    public FlightService() {
        this.flightsRepository = new FlightsRepository();
    }

    public List<FlightAirports> retrieveFlightFrom(String departureAirport) {
        return this.flightsRepository.getFlightAirports().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }
    public List<FlightAirports> retrieveFlightTo(String arrivalAirport) {
        return this.flightsRepository.getFlightAirports().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }
    public List<FlightAirports>retrievePossibleFlight(String departureAirport, String arrivalAirport) {
        return  this.flightsRepository.getFlightAirports().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport) && flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());





    }
}

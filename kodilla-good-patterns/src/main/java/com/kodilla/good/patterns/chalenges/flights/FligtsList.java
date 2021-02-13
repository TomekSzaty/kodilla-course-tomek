package com.kodilla.good.patterns.chalenges.flights;

import java.util.HashMap;

class FlightsList {
    public final HashMap<FlightAirports, FlightsTime> getFlightParameters() {

        FlightAirports flightAirports1 = new FlightAirports("A1101", "Gdańsk", "Warszawa", true);
        FlightAirports flightAirports2 = new FlightAirports("A1202", "Warszawa", "Gdańsk", true);
        FlightAirports flightAirports3 = new FlightAirports("B1303", "Wroclaw", "Gdańsk", true);
        FlightAirports flightAirports4 = new FlightAirports("B1404", "Gdańsk", "Wroclaw", true);
        FlightAirports flightAirports5 = new FlightAirports("C1505", "Wroclaw", "Warszawa", true);
        FlightAirports flightAirports6 = new FlightAirports("C1606", "Warszawa", "Wrocław", true);

        FlightsTime flightsTime1 = new FlightsTime("8:00", "10:00");
        FlightsTime flightsTime2 = new FlightsTime("9:00", "11:00");
        FlightsTime flightsTime3 = new FlightsTime("8:30", "10:30");
        FlightsTime flightsTime4 = new FlightsTime("9:30", "11:30");
        FlightsTime flightsTime5 = new FlightsTime("10:00", "12:00");
        FlightsTime flightsTime6 = new FlightsTime("12:00", "14:00");

        HashMap<FlightAirports, FlightsTime> flightParameters = new HashMap<>();

        flightParameters.put(flightAirports1, flightsTime1);
        flightParameters.put(flightAirports2, flightsTime2);
        flightParameters.put(flightAirports3, flightsTime3);
        flightParameters.put(flightAirports4, flightsTime4);
        flightParameters.put(flightAirports5, flightsTime5);
        flightParameters.put(flightAirports6, flightsTime6);

        return (flightParameters);
    }
}


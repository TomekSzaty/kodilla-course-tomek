package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FlightTestSuite {
    @Test
    void testFlightSearch() {
        //Given
        FlightSearch flightSearch = new FlightSearch();

        //Then & when
        assertDoesNotThrow(() -> flightSearch.findFlight(new Flight("New York","Sydney")));
    }
    @Test
    void testFlightSearchIsWrong() {
        //Given
        FlightSearch flightSearch = new FlightSearch();

        //Then&When
        assertThrows(RouteNotFoundException.class,() -> flightSearch.findFlight(new Flight("London","Sydney")));
    }
}
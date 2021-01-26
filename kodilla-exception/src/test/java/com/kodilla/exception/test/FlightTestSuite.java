package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FlightTestSuite {

    @Test
    void shouldFindFlight() throws RouteNotFoundException {
        //Given
        FlightSearch flightSearch = new FlightSearch();

        //when
        boolean result = flightSearch.findFlight(new Flight("New York","Sydney"));

        //then
        assertTrue(result);
    }

    @Test
    void shouldNotFindFlight() throws RouteNotFoundException {
        //Given
        FlightSearch flightSearch = new FlightSearch();

        //when
        boolean result = flightSearch.findFlight(new Flight("Los Angeles","Tokyo"));

        //then
        assertFalse(result);
    }

    @Test
    void shouldThrowException() {
        //Given
        FlightSearch flightSearch = new FlightSearch();

        //Then&When
        assertThrows(RouteNotFoundException.class,() -> flightSearch.findFlight(new Flight("London","Sydney")));
    }
}
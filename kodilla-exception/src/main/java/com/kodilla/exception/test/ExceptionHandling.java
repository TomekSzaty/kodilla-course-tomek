package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        /*SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(1.9, 1.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("UPS.... EXCEPTION !!! " + e.getMessage());
        } finally {
            System.out.println("This is  result of your act.");
        }
*/
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(new Flight("warsaw", "Sydney"));
        } catch (RouteNotFoundException e) {
            System.out.println("BRAK MIASTA DOCELOWEGO: " + e);
        } finally {
            System.out.println("Wyszukiwanie zakończone");
        }
    }
}

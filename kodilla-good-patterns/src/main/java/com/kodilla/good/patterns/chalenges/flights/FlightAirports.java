package com.kodilla.good.patterns.chalenges.flights;


import java.util.Objects;

public class FlightAirports {

    private final String numberFlight;
    private final String departureAirport;
    private final String arrivalAirport;
    private final boolean isAvailable;

     public FlightAirports(String numberFlight, String departureAirport, String arrivalAirport, boolean isAvailable) {
         this.numberFlight = numberFlight;
         this.departureAirport = departureAirport;
         this.arrivalAirport = arrivalAirport;
         this.isAvailable = isAvailable;
     }

     public String getNumberFlight() {
         return numberFlight;
     }

     public String getDepartureAirport() {
         return departureAirport;
     }

     public String getArrivalAirport() {
         return arrivalAirport;
     }

     public boolean isAvailable() {
         return isAvailable;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightAirports)) return false;
        FlightAirports that = (FlightAirports) o;
        return isAvailable() == that.isAvailable() && getNumberFlight().equals(that.getNumberFlight()) && getDepartureAirport().equals(that.getDepartureAirport()) && getArrivalAirport().equals(that.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberFlight(), getDepartureAirport(), getArrivalAirport(), isAvailable());
    }

    @Override
    public String toString() {
        return "Airports{" +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }
}

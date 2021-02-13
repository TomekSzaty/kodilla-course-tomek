package com.kodilla.good.patterns.chalenges.flights;

public class FlightsTime {

    private final String timeDeparture;
    private final String timeArrivals;

    public FlightsTime(String timeDeparture, String timeArrivals) {
        this.timeDeparture = timeDeparture;
        this.timeArrivals = timeArrivals;

    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public String getTimeArrivals() {
        return timeArrivals;
    }



    @Override
    public String toString() {
        return "FlightsTime{" +
                "timeDeparture=" + timeDeparture +
                ", timeArrivals=" + timeArrivals +
                '}';
    }
}

package com.kodilla.good.patterns.task135;

public final class Flight {
    private final String flightFrom;
    private final String flightTo;

    public Flight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    @Override
    public int hashCode() {
        String flight = getFlightFrom() + getFlightTo();
        return flight.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Flight flight = (Flight) obj;
        return this.flightFrom.equals(flight.getFlightFrom()) &&
               this.flightTo.equals(flight.getFlightTo());
    }

    @Override
    public String toString() {
        return flightFrom + " " + flightTo;
    }
}

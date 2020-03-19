package com.kodilla.good.patterns.task135;

import java.util.*;

public class FlightService {

    public HashSet<Flight> getFlights() {

        Set<Flight> flights = new HashSet<>();

        flights.add(new Flight("WAW", "GDN"));
        flights.add(new Flight("WAW", "KRK"));
        flights.add(new Flight("WAW", "POZ"));
        flights.add(new Flight("GDN", "WAW"));
        flights.add(new Flight("GDN", "KRK"));
        flights.add(new Flight("KRK", "GDN"));
        flights.add(new Flight("KRK", "WAW"));
        flights.add(new Flight("KRK", "POZ"));
        flights.add(new Flight("POZ", "WAW"));
        flights.add(new Flight("POZ", "KRK"));

        return new HashSet<>(flights);
    }
}

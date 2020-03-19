package com.kodilla.good.patterns.task135;

import java.util.*;
import java.util.stream.Collectors;

public class SearchFlights {

    FlightService flightService = new FlightService();

    public List<Flight> flightsFrom(String s) {
        return flightService.getFlights().stream()
                .filter(n -> n.getFlightFrom().equals(s))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsTo(String s) {
        return flightService.getFlights().stream()
                .filter(n -> n.getFlightTo().equals(s))
                .collect(Collectors.toList());
    }
}

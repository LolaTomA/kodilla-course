package com.kodilla.good.patterns.task135;

import java.util.List;
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

//    public List<String> indirectFlightsTo(String from, String to) {
//        return flightService.getFlights().stream()
//                .filter(n -> n.getFlightFrom().equals(from) || n.getFlightTo().equals(to))
//                .filter(n -> n.hashCode() != (from + to).hashCode())
//                .filter(n -> n.getFlightTo().equals(n.getFlightFrom()))
//                .collect(Collectors.toList());
//    }
}


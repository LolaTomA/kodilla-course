package com.kodilla.good.patterns.task135;

import java.util.ArrayList;
import java.util.List;

public class ExecuteFlightSearch {

    SearchFlights searchFlights = new SearchFlights();

    List<Flight> indirectFlightsTo = new ArrayList<>();

    public List<Flight> indirectFlightsTo(String from, String to) {

        List<Flight> listFrom = searchFlights.flightsFrom(from);
        List<Flight> listTo = searchFlights.flightsTo(to);

        for (Flight flight : listFrom) {
            for (int n = 0; n < listTo.size(); n++) {
                if (flight.getFlightTo().equals(listTo.get(n).getFlightFrom())) {
                    indirectFlightsTo.add(flight);
                    indirectFlightsTo.add(listTo.get(n));
                }
            }
        }
        if (indirectFlightsTo.isEmpty()) {
            System.out.println("Sorry there is no indirect flight");
        }
        return indirectFlightsTo;
    }
}

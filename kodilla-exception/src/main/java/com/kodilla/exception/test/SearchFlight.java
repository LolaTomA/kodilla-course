package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    public Boolean findFlight(Flight flight)throws RouteNotFoundException {

        Boolean airportStatus = new Boolean(false);
        Map<String, Boolean> airportReady = new HashMap<>();

        airportReady.put("Warsaw", true);
        airportReady.put(("Wroclaw", true);
        airportReady.put("Gdansk", true);
        airportReady.put("Krakow", true);
        airportReady.put(("Rome", false);
        airportReady.put("Milan", false);
        airportReady.put("Beijing", false);


        if (airportReady.containsKey(flight.getArrivalAirport())) {
            airportStatus = airportReady.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException(flight);
        }
        return airportStatus;
    }
}
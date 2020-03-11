package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    public Boolean findFlight(Flight flight)throws RouteNotFoundException {

        Boolean airportStatus = new Boolean(false);
        Map<String, Boolean> airportReady = new HashMap<>();

        if (airportReady.containsKey(flight.getArrivalAirport())) {
            airportStatus = airportReady.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException(flight);
        }
        return airportStatus;
    }
}
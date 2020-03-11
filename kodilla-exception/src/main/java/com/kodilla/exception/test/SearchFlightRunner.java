package com.kodilla.exception.test;

public class SearchFlightRunner {
    public static void main(String [] args) {
        Flight flight = new Flight("Warsaw", "Barcelona");

        SearchFlight searchFlight = new SearchFlight();
        try {
            if  (searchFlight.findFlight(flight)) {
                System.out.println("You can fly from: " + flight.getDepartureAirport() +
                        " to " + flight.getArrivalAirport());
            } else {
                System.out.println("You can\'t fly from: " + flight.getDepartureAirport() +
                        " to " + flight.getArrivalAirport());
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Error! There\'s no such destination (arrivalAirport). ");
        }
    }
}

package com.kodilla.good.patterns.task135;

public class ApplicationFlightSearch {

        public static void main(String[] args) {

            FlightService flightService = new FlightService();
            SearchFlights searchFlights = new SearchFlights();
            ExecuteFlightSearch executeFlightSearch = new ExecuteFlightSearch();

            System.out.println("The list of All flights: " + flightService.getFlights());
            System.out.println("Flights from Warsaw: " + searchFlights.flightsFrom("WAW"));
            System.out.println("Flights to Gdansk: " + searchFlights.flightsTo("GDN"));
            System.out.println("Indirect flights from Gdansk to Poznan: " + executeFlightSearch.indirectFlightsTo("GDN", "POZ"));
        }
}

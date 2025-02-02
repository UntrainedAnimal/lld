package org.example.flight_management.flight;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
public class FlightSearch {

    private final List<Flight> flights;

    public List<Flight> searchFlights(String source, String destination, LocalDate date){

        return flights.stream().filter(flight -> flight.source().equalsIgnoreCase(source)
                && flight.destination().equalsIgnoreCase(destination)
                && flight.departureTime().toLocalDate().equals(date))
                .toList();
    }
}

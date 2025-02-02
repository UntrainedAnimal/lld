package org.example.flight_management.flight;

import org.example.flight_management.seats.Seat;

import java.time.LocalDateTime;
import java.util.List;

public record Flight(String flightNumber,
                     String source,
                     String destination,
                     LocalDateTime departureTime,
                     LocalDateTime arrivalTime,
                     List<Seat> availableSeats) {


}

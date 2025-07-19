package org.example.parking_lot.fee;

import org.example.parking_lot.ParkingTicket;

public interface FeeStrategy {
    double calculateFee(ParkingTicket parkingTicket);
}

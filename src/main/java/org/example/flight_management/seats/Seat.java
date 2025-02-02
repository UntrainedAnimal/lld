package org.example.flight_management.seats;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.flight_management.Constants;

@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Seat {
    private final String seatNumber;
    private final Constants.SeatType type;
    private Constants.SeatStatus status;

    public Seat(String seatNumber, Constants.SeatType seatType){
        this.seatNumber=seatNumber;
        this.type = seatType;
        this.status = Constants.SeatStatus.AVAILABLE;
    }

    public void reserve(){
        status = Constants.SeatStatus.RESERVED;
    }
    public void release(){
        this.status = Constants.SeatStatus.AVAILABLE;
    }
}

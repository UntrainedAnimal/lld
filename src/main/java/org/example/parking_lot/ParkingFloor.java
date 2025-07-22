package org.example.parking_lot;

import org.example.parking_lot.parking_spot.ParkingSpot;
import org.example.parking_lot.vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public class ParkingFloor {
    private final int floorNumber;
    private final List<ParkingSpot> parkingSpots;

    public ParkingFloor(int floorNumber,List<ParkingSpot> parkingSpots){
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
    }

    public synchronized Optional<ParkingSpot> getAvailableSpot(Vehicle vehicle){
        return parkingSpots.stream().filter(parkingSpot -> parkingSpot.canFitVehicle(vehicle))
                .filter(ParkingSpot::isAvailable)
                .findFirst();
    }
    public int getFloorNumber(){
        return floorNumber;
    }
}


/*PARKING LOT --> PARK,UNPARK ---> list of floor, payment mode
        floor->list of spot, floor number, get available spot



 */
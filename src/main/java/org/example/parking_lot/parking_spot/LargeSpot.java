package org.example.parking_lot.parking_spot;

import org.example.parking_lot.vehicle.Vehicle;
import org.example.parking_lot.vehicle.VehicleType;

public class LargeSpot extends ParkingSpot {
    public LargeSpot(String spotId) {
        super(spotId);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getType() == VehicleType.TRUCK;
    }
}
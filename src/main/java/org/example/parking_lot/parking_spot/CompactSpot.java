package org.example.parking_lot.parking_spot;

import org.example.parking_lot.vehicle.Vehicle;
import org.example.parking_lot.vehicle.VehicleType;

public class CompactSpot extends ParkingSpot{
    public CompactSpot(String spotId) {
        super(spotId);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        VehicleType type = vehicle.getType();
        return type == VehicleType.CAR;
    }
}

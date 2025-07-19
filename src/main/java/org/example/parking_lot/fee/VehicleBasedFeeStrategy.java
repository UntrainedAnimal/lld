package org.example.parking_lot.fee;

import org.example.parking_lot.ParkingTicket;
import org.example.parking_lot.vehicle.Vehicle;
import org.example.parking_lot.vehicle.VehicleType;

import java.util.Map;

public class VehicleBasedFeeStrategy implements FeeStrategy{
    private final Map<VehicleType,Double> hourlyRates = Map.of(
            VehicleType.BIKE,10.0,
            VehicleType.CAR,20.0,
            VehicleType.TRUCK,30.0
    );

    @Override
    public double calculateFee(ParkingTicket parkingTicket) {
        long duration = parkingTicket.getExitTimeStamp()- parkingTicket.getEntryTimeStamp();
        long hours = (duration/(1000*60*60))  +1 ;
        return hours*hourlyRates.get(parkingTicket.getVehicle().getType());
    }
}

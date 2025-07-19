package org.example.parking_lot;

import org.example.parking_lot.fee.FeeStrategy;
import org.example.parking_lot.fee.FlatRateFeeStrategy;
import org.example.parking_lot.parking_spot.ParkingSpot;
import org.example.parking_lot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private static final ParkingLot INSTANCE = new ParkingLot();
    private final List<ParkingFloor> floors = new ArrayList<>();

    private final Map<String,ParkingTicket> activeTickets = new ConcurrentHashMap<>();
    private FeeStrategy feeStrategy;

    private ParkingLot(){
        feeStrategy = new FlatRateFeeStrategy();
    }
    public static synchronized ParkingLot getInstance(){
        return INSTANCE;
    }
    public void addFloor(ParkingFloor floor){
        floors.add(floor);
    }
    public void setFeeStrategy(FeeStrategy feeStrategy){
        this.feeStrategy = feeStrategy;
    }

    public synchronized ParkingTicket parkVehicle(Vehicle vehicle) throws Exception{
        for(ParkingFloor floor :floors){
            Optional<ParkingSpot> availableSpot = floor.getAvailableSpot(vehicle);
            if(availableSpot.isPresent()){
                ParkingSpot parkingSpot = availableSpot.get();
                if(parkingSpot.assignVehicle(vehicle)){
                    ParkingTicket parkingTicket = new ParkingTicket(vehicle, parkingSpot);
                    activeTickets.put(vehicle.getRegistrationNumber(), parkingTicket);
                    return parkingTicket;
                }
            }
        }
        throw new Exception("No available spot for "+vehicle.getType());
    }

    public synchronized double unparkVehicle(String registrationNumber) throws Exception {
        ParkingTicket parkingTicket = activeTickets.get(registrationNumber);

        if(parkingTicket==null){
            throw new Exception("Ticket not found");
        }
        activeTickets.remove(registrationNumber);
        parkingTicket.getParkingSpot().removeVehicle();
        parkingTicket.setExitTimeStamp();
        return feeStrategy.calculateFee(parkingTicket);

    }
}

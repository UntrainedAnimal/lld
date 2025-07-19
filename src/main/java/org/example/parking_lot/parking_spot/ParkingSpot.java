package org.example.parking_lot.parking_spot;

import org.example.parking_lot.vehicle.Vehicle;

public abstract class ParkingSpot {
    private final String spotId;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(String spotId){
        this.spotId=spotId;
        isOccupied=false;
    }
    public synchronized boolean isAvailable(){
        return !this.isOccupied;
    }
    public synchronized  boolean assignVehicle(Vehicle vehicle){
        if(isOccupied){
            return false;
        }
        isOccupied=true;
        this.vehicle=vehicle;
        return true;
    }
    public synchronized void removeVehicle(){
        vehicle=null;
        isOccupied=false;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }
    public String getSpotId(){
        return this.spotId;
    }

    public abstract boolean canFitVehicle(Vehicle vehicle);
}

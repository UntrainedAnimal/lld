package org.example.parking_lot.vehicle;

public abstract class Vehicle {
    protected String registrationNumber;
    protected VehicleType type;

    public Vehicle(VehicleType type, String registrationNumber) {
        this.type = type;
        this.registrationNumber = registrationNumber;
    }
    public String getRegistrationNumber(){
        return this.registrationNumber;
    }
    public VehicleType getType(){
        return this.type;
    }
}

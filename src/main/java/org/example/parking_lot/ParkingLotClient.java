package org.example.parking_lot;

import org.example.parking_lot.fee.VehicleBasedFeeStrategy;
import org.example.parking_lot.parking_spot.ParkingSpot;
import org.example.parking_lot.parking_spot.ParkingSpotFactory;
import org.example.parking_lot.parking_spot.ParkingSpotType;
import org.example.parking_lot.vehicle.Bike;
import org.example.parking_lot.vehicle.Car;
import org.example.parking_lot.vehicle.Vehicle;

import java.util.List;

public class ParkingLotClient {
    public static void main(String[] args) {
        ParkingLot instance = ParkingLot.getInstance();
        List<ParkingSpot> parkingSpotsFloor1 = List.of(
                ParkingSpotFactory.createParkingSpot(ParkingSpotType.BIKE, "101"),
                ParkingSpotFactory.createParkingSpot(ParkingSpotType.COMPACT, "102"),
                ParkingSpotFactory.createParkingSpot(ParkingSpotType.LARGE, "103")
        );

        List<ParkingSpot> parkingSpotsFloor2 = List.of(
                ParkingSpotFactory.createParkingSpot(ParkingSpotType.COMPACT, "201"),
                ParkingSpotFactory.createParkingSpot(ParkingSpotType.LARGE, "202")
        );

        // Add a floor with different types of spots
        ParkingFloor floor1 = new ParkingFloor(1, parkingSpotsFloor1);
        ParkingFloor floor2 = new ParkingFloor(2, parkingSpotsFloor2);

        instance.addFloor(floor1);
        instance.addFloor(floor2);
        instance.setFeeStrategy(new VehicleBasedFeeStrategy());

        Vehicle car1 = new Car("ABC123");
        Vehicle car2 = new Car("XYZ789");
        Vehicle bike1 = new Bike("M1234");


        try {
            ParkingTicket parkingTicket1 = instance.parkVehicle(car1);
            System.out.println("Car 1 parked, Ticket Id: " + parkingTicket1.getTicketId());

            ParkingTicket parkingTicket2 = instance.parkVehicle(car2);
            System.out.println("Car 2 parked, Ticket Id: " + parkingTicket2.getTicketId());

            ParkingTicket parkingTicket3 = instance.parkVehicle(bike1);
            System.out.println("Bike 1 parked, Ticket Id: " + parkingTicket3.getTicketId());

            // Try parking another car when spots are full
            Vehicle car3 = new Car("DL0432");
            instance.parkVehicle(car3);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Unpark vehicles
        try {
            double fee = instance.unparkVehicle(car1.getRegistrationNumber()); // valid ticket ID
            System.out.println("Vehicle: " + car1.getRegistrationNumber() + ", Fee: " + fee);

            fee = instance.unparkVehicle("1"); // invalid license number
        } catch (Exception e) {
            System.out.println("Exception while unparking: " + e.getMessage());
        }
    }
}

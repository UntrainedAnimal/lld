package org.example.parking_lot.parking_spot;

public class ParkingSpotFactory {
    public static ParkingSpot createParkingSpot(ParkingSpotType type,String spotId){
        return switch (type){
            case BIKE -> new BikeSpot(spotId);
            case COMPACT -> new CompactSpot(spotId);
            case LARGE -> new LargeSpot(spotId);
        };
    }
}

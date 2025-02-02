package org.example.flight_management;

public interface Constants {
    enum SeatStatus{
        AVAILABLE,
        RESERVED,
        OCCUPIED
    }

    enum SeatType{
        ECONOMY,
        PREMIUM_ECONOMY,
        BUSINESS,
        FIRST_CLASS
    }

    enum PaymentStatus{
        PENDING,
        COMPLETED,
        FAILED,
        REFUNDED
    }
}

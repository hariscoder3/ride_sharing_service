package com.codingshuttle.project.uber.RideApp.strategies;

import com.codingshuttle.project.uber.RideApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);

}

package com.codingshuttle.project.uber.RideApp.strategies.impl;

import com.codingshuttle.project.uber.RideApp.entities.RideRequest;
import com.codingshuttle.project.uber.RideApp.services.DistanceService;
import com.codingshuttle.project.uber.RideApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),
                rideRequest.getDropOffLocation());
        return distance*RIDE_FARE_MULTIPLIER;
    }
}

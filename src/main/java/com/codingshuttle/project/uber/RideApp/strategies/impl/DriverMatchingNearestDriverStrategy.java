package com.codingshuttle.project.uber.RideApp.strategies.impl;

import com.codingshuttle.project.uber.RideApp.entities.Driver;
import com.codingshuttle.project.uber.RideApp.entities.RideRequest;
import com.codingshuttle.project.uber.RideApp.repositories.DriverRepository;
import com.codingshuttle.project.uber.RideApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
package com.codingshuttle.project.uber.RideApp.strategies;

import com.codingshuttle.project.uber.RideApp.entities.Driver;
import com.codingshuttle.project.uber.RideApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}

package com.codingshuttle.project.uber.RideApp.services;

import com.codingshuttle.project.uber.RideApp.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}

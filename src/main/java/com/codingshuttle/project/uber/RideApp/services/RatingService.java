package com.codingshuttle.project.uber.RideApp.services;

import com.codingshuttle.project.uber.RideApp.dto.DriverDto;
import com.codingshuttle.project.uber.RideApp.dto.RiderDto;
import com.codingshuttle.project.uber.RideApp.entities.Driver;
import com.codingshuttle.project.uber.RideApp.entities.Ride;
import com.codingshuttle.project.uber.RideApp.entities.Rider;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}

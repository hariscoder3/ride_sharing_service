package com.codingshuttle.project.uber.RideApp.services;

import com.codingshuttle.project.uber.RideApp.dto.DriverDto;
import com.codingshuttle.project.uber.RideApp.dto.RideDto;
import com.codingshuttle.project.uber.RideApp.dto.RideRequestDto;
import com.codingshuttle.project.uber.RideApp.dto.RiderDto;
import com.codingshuttle.project.uber.RideApp.entities.Rider;
import com.codingshuttle.project.uber.RideApp.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}

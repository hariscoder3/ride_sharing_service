package com.codingshuttle.project.uber.RideApp.services.impl;

import com.codingshuttle.project.uber.RideApp.entities.RideRequest;
import com.codingshuttle.project.uber.RideApp.exceptions.ResourceNotFoundException;
import com.codingshuttle.project.uber.RideApp.repositories.RideRequestRepository;
import com.codingshuttle.project.uber.RideApp.services.RideRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideRequestServiceImpl implements RideRequestService {

    private final RideRequestRepository rideRequestRepository;

    @Override
    public RideRequest findRideRequestById(Long rideRequestId) {
        return rideRequestRepository.findById(rideRequestId)
                .orElseThrow(() -> new ResourceNotFoundException("RideRequest not found with id: "+rideRequestId));
    }

    @Override
    public void update(RideRequest rideRequest) {
        rideRequestRepository.findById(rideRequest.getId())
                .orElseThrow(() -> new ResourceNotFoundException("RideRequest not found with id: "+rideRequest.getId()));
        rideRequestRepository.save(rideRequest);
    }
}

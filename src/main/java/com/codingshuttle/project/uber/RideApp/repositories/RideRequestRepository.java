package com.codingshuttle.project.uber.RideApp.repositories;

import com.codingshuttle.project.uber.RideApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {

}

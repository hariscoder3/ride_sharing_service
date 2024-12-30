package com.codingshuttle.project.uber.RideApp.repositories;

import com.codingshuttle.project.uber.RideApp.entities.Payment;
import com.codingshuttle.project.uber.RideApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByRide(Ride ride);
}

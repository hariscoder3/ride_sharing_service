package com.codingshuttle.project.uber.RideApp.services.impl;

import com.codingshuttle.project.uber.RideApp.entities.Payment;
import com.codingshuttle.project.uber.RideApp.entities.Ride;
import com.codingshuttle.project.uber.RideApp.entities.enums.PaymentStatus;
import com.codingshuttle.project.uber.RideApp.exceptions.ResourceNotFoundException;
import com.codingshuttle.project.uber.RideApp.repositories.PaymentRepository;
import com.codingshuttle.project.uber.RideApp.services.PaymentService;
import com.codingshuttle.project.uber.RideApp.strategies.PaymentStrategyManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentStrategyManager paymentStrategyManager;

    @Override
    public void processPayment(Ride ride) {
        Payment payment = paymentRepository.findByRide(ride)
                        .orElseThrow(() -> new ResourceNotFoundException("Payment not found for ride with id: "+ride.getId()));
        paymentStrategyManager.paymentStrategy(payment.getPaymentMethod()).processPayment(payment);
    }

    @Override
    public Payment createNewPayment(Ride ride) {
        Payment payment = Payment.builder()
                .ride(ride)
                .paymentMethod(ride.getPaymentMethod())
                .amount(ride.getFare())
                .paymentStatus(PaymentStatus.PENDING)
                .build();
        return paymentRepository.save(payment);
    }

    @Override
    public void updatePaymentStatus(Payment payment, PaymentStatus status) {
        payment.setPaymentStatus(status);
        paymentRepository.save(payment);
    }
}

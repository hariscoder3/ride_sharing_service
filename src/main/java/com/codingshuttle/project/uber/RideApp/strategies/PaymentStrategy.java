package com.codingshuttle.project.uber.RideApp.strategies;

import com.codingshuttle.project.uber.RideApp.entities.Payment;

public interface PaymentStrategy {
    Double PLATFORM_COMMISSION = 0.3;
    void processPayment(Payment payment);

}

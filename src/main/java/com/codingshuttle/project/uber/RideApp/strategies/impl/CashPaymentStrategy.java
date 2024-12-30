package com.codingshuttle.project.uber.RideApp.strategies.impl;

import com.codingshuttle.project.uber.RideApp.entities.Driver;
import com.codingshuttle.project.uber.RideApp.entities.Payment;
import com.codingshuttle.project.uber.RideApp.entities.enums.PaymentStatus;
import com.codingshuttle.project.uber.RideApp.entities.enums.TransactionMethod;
import com.codingshuttle.project.uber.RideApp.repositories.PaymentRepository;
import com.codingshuttle.project.uber.RideApp.services.PaymentService;
import com.codingshuttle.project.uber.RideApp.services.WalletService;
import com.codingshuttle.project.uber.RideApp.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//Rider -> 100
//Driver -> 70 Deduct 30Rs from Driver's wallet

@Service
@RequiredArgsConstructor
public class CashPaymentStrategy implements PaymentStrategy {

    private final WalletService walletService;
    private final PaymentRepository paymentRepository;

    @Override
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();

        double platformCommission = payment.getAmount() * PLATFORM_COMMISSION;

        walletService.deductMoneyFromWallet(driver.getUser(), platformCommission, null,
                payment.getRide(), TransactionMethod.RIDE);

        payment.setPaymentStatus(PaymentStatus.CONFIRMED);
        paymentRepository.save(payment);
    }
}

//10 ratingsCount -> 4.0
//new rating 4.6
//updated rating
//new rating 44.6/11 -> 4.05
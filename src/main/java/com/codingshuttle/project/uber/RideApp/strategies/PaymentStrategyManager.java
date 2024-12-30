package com.codingshuttle.project.uber.RideApp.strategies;

import com.codingshuttle.project.uber.RideApp.entities.enums.PaymentMethod;
import com.codingshuttle.project.uber.RideApp.strategies.impl.CashPaymentStrategy;
import com.codingshuttle.project.uber.RideApp.strategies.impl.WalletPaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentStrategyManager {

    private final WalletPaymentStrategy walletPaymentStrategy;
    private final CashPaymentStrategy cashPaymentStrategy;

    public PaymentStrategy paymentStrategy(PaymentMethod paymentMethod) {
        return switch (paymentMethod) {
            case WALLET -> walletPaymentStrategy;
            case CASH -> cashPaymentStrategy;
        };
    }
}

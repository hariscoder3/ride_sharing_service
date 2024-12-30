package com.codingshuttle.project.uber.RideApp.services;

import com.codingshuttle.project.uber.RideApp.entities.Ride;
import com.codingshuttle.project.uber.RideApp.entities.User;
import com.codingshuttle.project.uber.RideApp.entities.Wallet;
import com.codingshuttle.project.uber.RideApp.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount,
                            String transactionId, Ride ride,
                            TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount,
                                 String transactionId, Ride ride,
                                 TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);

}

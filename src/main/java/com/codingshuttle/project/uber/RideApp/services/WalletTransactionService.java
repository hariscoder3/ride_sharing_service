package com.codingshuttle.project.uber.RideApp.services;

import com.codingshuttle.project.uber.RideApp.dto.WalletTransactionDto;
import com.codingshuttle.project.uber.RideApp.entities.WalletTransaction;

public interface WalletTransactionService {

    void createNewWalletTransaction(WalletTransaction walletTransaction);

}

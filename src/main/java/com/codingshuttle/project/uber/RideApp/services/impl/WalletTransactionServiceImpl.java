package com.codingshuttle.project.uber.RideApp.services.impl;

import com.codingshuttle.project.uber.RideApp.dto.WalletTransactionDto;
import com.codingshuttle.project.uber.RideApp.entities.WalletTransaction;
import com.codingshuttle.project.uber.RideApp.repositories.WalletTransactionRepository;
import com.codingshuttle.project.uber.RideApp.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransaction walletTransaction) {
        walletTransactionRepository.save(walletTransaction);
    }

}

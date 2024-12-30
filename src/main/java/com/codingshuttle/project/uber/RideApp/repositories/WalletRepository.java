package com.codingshuttle.project.uber.RideApp.repositories;

import com.codingshuttle.project.uber.RideApp.entities.User;
import com.codingshuttle.project.uber.RideApp.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Optional<Wallet> findByUser(User user);
}

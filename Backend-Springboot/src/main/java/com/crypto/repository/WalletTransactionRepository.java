package com.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crypto.domain.WalletTransactionType;
import com.crypto.model.Wallet;
import com.crypto.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}

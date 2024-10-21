package com.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crypto.domain.WithdrawalStatus;
import com.crypto.model.Withdrawal;

import java.util.List;

public interface WithdrawalRepository extends JpaRepository<Withdrawal,Long> {
    List<Withdrawal> findByUserId(Long userId);
}

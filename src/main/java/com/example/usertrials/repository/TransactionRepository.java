package com.example.usertrials.repository;

import com.example.usertrials.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
    List<Transaction> findByAccountId(Integer accountId);
}

package com.example.financeapp.service;

import com.example.financeapp.model.Account;
import com.example.financeapp.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account createAccount(Long userId) {
        Account account = new Account().setUserId(userId).setBalance(0);
        return accountRepository.save(account);
    }

    public Optional<Account> getAccountByUserId(Long userId) {
        return accountRepository.findByUserId(userId);
    }

    public Account increaseBalance(Long userId, double amount) {
        Account account = accountRepository.findByUserId(userId)
                .orElseThrow(() -> new IllegalArgumentException("Рахунок не знайдено"));
        account.increaseBalance(amount);
        return accountRepository.save(account);
    }

    public Account decreaseBalance(Long userId, double amount) {
        Account account = accountRepository.findByUserId(userId)
                .orElseThrow(() -> new IllegalArgumentException("Рахунок не знайдено"));
        account.decreaseBalance(amount);
        return accountRepository.save(account);
    }
}
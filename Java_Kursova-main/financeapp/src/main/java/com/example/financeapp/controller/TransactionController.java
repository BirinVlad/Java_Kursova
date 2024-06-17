package com.example.financeapp.controller;

import com.example.financeapp.model.Transaction;
import com.example.financeapp.service.TransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
@Tag(name = "Transaction")
public class TransactionController {

    private final TransactionService transactionService;

    @Operation(summary = "Додати нову транзакцію")
    @PostMapping
    public Transaction addTransaction(@RequestBody @Valid Transaction transaction) {
        return transactionService.addTransaction(transaction);
    }

    @Operation(summary = "Отримати транзакції користувача")
    @GetMapping("/{userId}")
    public List<Transaction> getUserTransactions(@PathVariable Long userId) {
        return transactionService.getUserTransactions(userId);
    }

    @Operation(summary = "Видалити транзакцію")
    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransaction(id);
    }
}
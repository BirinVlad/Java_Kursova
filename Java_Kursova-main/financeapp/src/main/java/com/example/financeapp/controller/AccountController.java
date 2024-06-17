package com.example.financeapp.controller;

import com.example.financeapp.model.Account;
import com.example.financeapp.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
@Tag(name = "Account", description = "Управління рахунками користувачів")
public class AccountController {

    private final AccountService accountService;

    @Operation(summary = "Створити рахунок для користувача")
    @PostMapping("/create")
    public Account createAccount(@RequestParam Long userId) {
        return accountService.createAccount(userId);
    }

    @Operation(summary = "Отримати рахунок користувача")
    @GetMapping("/{userId}")
    public Account getAccountByUserId(@PathVariable Long userId) {
        return accountService.getAccountByUserId(userId)
                .orElseThrow(() -> new IllegalArgumentException("Рахунок не знайдено"));
    }

    @Operation(summary = "Збільшити баланс рахунку")
    @PostMapping("/increase")
    public Account increaseBalance(@RequestParam Long userId, @RequestParam double amount) {
        return accountService.increaseBalance(userId, amount);
    }

    @Operation(summary = "Зменшити баланс рахунку")
    @PostMapping("/decrease")
    public Account decreaseBalance(@RequestParam Long userId, @RequestParam double amount) {
        return accountService.decreaseBalance(userId, amount);
    }
}
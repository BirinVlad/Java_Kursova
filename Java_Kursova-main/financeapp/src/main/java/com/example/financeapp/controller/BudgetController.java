package com.example.financeapp.controller;

import com.example.financeapp.model.Budget;
import com.example.financeapp.service.BudgetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budgets")
@RequiredArgsConstructor
@Tag(name = "Budget")
public class BudgetController {

    private final BudgetService budgetService;

    @Operation(summary = "Додати новий бюджет")
    @PostMapping
    public Budget addBudget(@RequestBody @Valid Budget budget) {
        return budgetService.addBudget(budget);
    }

    @Operation(summary = "Отримати бюджети користувача")
    @GetMapping("/{userId}")
    public List<Budget> getUserBudgets(@PathVariable Long userId) {
        return budgetService.getUserBudgets(userId);
    }

    @Operation(summary = "Видалити бюджет")
    @DeleteMapping("/{id}")
    public void deleteBudget(@PathVariable Long id) {
        budgetService.deleteBudget(id);
    }
}
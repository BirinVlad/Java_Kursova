package com.example.financeapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Entity
@Accessors(chain = true)
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    private double balance;

    // Метод для збільшення балансу
    public void increaseBalance(double amount) {
        this.balance += amount;
    }

    // Метод для зменшення балансу
    public void decreaseBalance(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Недостатньо коштів");
        }
    }
}
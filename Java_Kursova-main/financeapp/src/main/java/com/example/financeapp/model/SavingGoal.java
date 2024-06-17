//package com.example.financeapp.model;
//
//import jakarta.persistence.*;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "saving_goals")
//public class SavingGoal {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    private String goalName;
//    private Double targetAmount;
//    private Double currentAmount;
//    private LocalDate dueDate;
//
//    // Getters and Setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getGoalName() {
//        return goalName;
//    }
//
//    public void setGoalName(String goalName) {
//        this.goalName = goalName;
//    }
//
//    public Double getTargetAmount() {
//        return targetAmount;
//    }
//
//    public void setTargetAmount(Double targetAmount) {
//        this.targetAmount = targetAmount;
//    }
//
//    public Double getCurrentAmount() {
//        return currentAmount;
//    }
//
//    public void setCurrentAmount(Double currentAmount) {
//        this.currentAmount = currentAmount;
//    }
//
//    public LocalDate getDueDate() {
//        return dueDate;
//    }
//
//    public void setDueDate(LocalDate dueDate) {
//        this.dueDate = dueDate;
//    }
//}

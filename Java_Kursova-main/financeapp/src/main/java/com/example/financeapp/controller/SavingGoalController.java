//package com.example.financeapp.controller;
//
//import com.example.financeapp.model.SavingGoal;
//import com.example.financeapp.service.SavingGoalService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/saving-goals")
//public class SavingGoalController {
//
//    @Autowired
//    private SavingGoalService savingGoalService;
//
//    @PostMapping
//    public ResponseEntity<SavingGoal> createSavingGoal(@RequestBody SavingGoal savingGoal) {
//        SavingGoal newSavingGoal = savingGoalService.createSavingGoal(savingGoal);
//        return ResponseEntity.ok(newSavingGoal);
//    }
//
//    @GetMapping("/{userId}")
//    public ResponseEntity<List<SavingGoal>> getSavingGoalsByUser(@PathVariable Long userId) {
//        List<SavingGoal> savingGoals = savingGoalService.getSavingGoalsByUser(userId);
//        return ResponseEntity.ok(savingGoals);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<SavingGoal> updateSavingGoal(@PathVariable Long id, @RequestBody SavingGoal savingGoal) {
//        SavingGoal updatedSavingGoal = savingGoalService.updateSavingGoal(id, savingGoal);
//        return ResponseEntity.ok(updatedSavingGoal);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteSavingGoal(@PathVariable Long id) {
//        savingGoalService.deleteSavingGoal(id);
//        return ResponseEntity.noContent().build();
//    }
//}

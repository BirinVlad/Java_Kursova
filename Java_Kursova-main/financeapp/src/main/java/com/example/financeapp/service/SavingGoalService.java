//package com.example.financeapp.service;
//
//import com.example.financeapp.model.SavingGoal;
//import com.example.financeapp.repository.SavingGoalRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class SavingGoalService {
//
//    @Autowired
//    private SavingGoalRepository savingGoalRepository;
//
//    public SavingGoal createSavingGoal(SavingGoal savingGoal) {
//        return savingGoalRepository.save(savingGoal);
//    }
//
//    public List<SavingGoal> getSavingGoalsByUser(Long userId) {
//        return savingGoalRepository.findByUserId(userId);
//    }
//
//    public SavingGoal updateSavingGoal(Long id, SavingGoal savingGoal) {
//        SavingGoal existingSavingGoal = savingGoalRepository.findById(id).orElseThrow(() -> new RuntimeException("Saving goal not found"));
//        existingSavingGoal.setGoalName(savingGoal.getGoalName());
//        existingSavingGoal.setTargetAmount(savingGoal.getTargetAmount());
//        existingSavingGoal.setCurrentAmount(savingGoal.getCurrentAmount());
//        existingSavingGoal.setDueDate(savingGoal.getDueDate());
//        return savingGoalRepository.save(existingSavingGoal);
//    }
//
//    public void deleteSavingGoal(Long id) {
//        savingGoalRepository.deleteById(id);
//    }
//}

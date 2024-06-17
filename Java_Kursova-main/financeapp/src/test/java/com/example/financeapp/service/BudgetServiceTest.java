//package com.example.financeapp.service;
//
//import com.example.financeapp.model.Budget;
//import com.example.financeapp.repository.BudgetRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//public class BudgetServiceTest {
//
//    @Mock
//    private BudgetRepository budgetRepository;
//
//    @InjectMocks
//    private BudgetService budgetService;
//
//    @Test
//    public void testCreateBudget() {
//        Budget budget = new Budget();
//        budget.setAmount(1000.0);
//
//        when(budgetRepository.save(budget)).thenReturn(budget);
//
//        Budget newBudget = budgetService.createBudget(budget);
//
//        assertNotNull(newBudget);
//        assertEquals(1000.0, newBudget.getAmount());
//        verify(budgetRepository, times(1)).save(budget);
//    }
//
//    @Test
//    public void testUpdateBudget() {
//        Budget existingBudget = new Budget();
//        existingBudget.setId(1L);
//        existingBudget.setAmount(1000.0);
//
//        Budget updatedBudget = new Budget();
//        updatedBudget.setAmount(2000.0);
//
//        when(budgetRepository.findById(1L)).thenReturn(Optional.of(existingBudget));
//        when(budgetRepository.save(existingBudget)).thenReturn(existingBudget);
//
//        Budget result = budgetService.updateBudget(1L, updatedBudget);
//
//        assertNotNull(result);
//        assertEquals(2000.0, result.getAmount());
//        verify(budgetRepository, times(1)).findById(1L);
//        verify(budgetRepository, times(1)).save(existingBudget);
//    }
//
//    @Test
//    public void testDeleteBudget() {
//        budgetService.deleteBudget(1L);
//        verify(budgetRepository, times(1)).deleteById(1L);
//    }
//}

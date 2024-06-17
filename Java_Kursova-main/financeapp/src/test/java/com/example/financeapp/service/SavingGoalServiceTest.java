//package com.example.financeapp.service;
//
//import com.example.financeapp.model.SavingGoal;
//import com.example.financeapp.repository.SavingGoalRepository;
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
//public class SavingGoalServiceTest {
//
//    @Mock
//    private SavingGoalRepository savingGoalRepository;
//
//    @InjectMocks
//    private SavingGoalService savingGoalService;
//
//    @Test
//    public void testCreateSavingGoal() {
//        SavingGoal savingGoal = new SavingGoal();
//        savingGoal.setGoalName("Vacation");
//        savingGoal.setTargetAmount(5000.0);
//
//        when(savingGoalRepository.save(savingGoal)).thenReturn(savingGoal);
//
//        SavingGoal newSavingGoal = savingGoalService.createSavingGoal(savingGoal);
//
//        assertNotNull(newSavingGoal);
//        assertEquals("Vacation", newSavingGoal.getGoalName());
//        assertEquals(5000.0, newSavingGoal.getTargetAmount());
//        verify(savingGoalRepository, times(1)).save(savingGoal);
//    }
//
//    @Test
//    public void testUpdateSavingGoal() {
//        SavingGoal existingSavingGoal = new SavingGoal();
//        existingSavingGoal.setId(1L);
//        existingSavingGoal.setGoalName("Vacation");
//        existingSavingGoal.setTargetAmount(5000.0);
//
//        SavingGoal updatedSavingGoal = new SavingGoal();
//        updatedSavingGoal.setGoalName("New Vacation");
//        updatedSavingGoal.setTargetAmount(6000.0);
//
//        when(savingGoalRepository.findById(1L)).thenReturn(Optional.of(existingSavingGoal));
//        when(savingGoalRepository.save(existingSavingGoal)).thenReturn(existingSavingGoal);
//
//        SavingGoal result = savingGoalService.updateSavingGoal(1L, updatedSavingGoal);
//
//        assertNotNull(result);
//        assertEquals("New Vacation", result.getGoalName());
//        assertEquals(6000.0, result.getTargetAmount());
//        verify(savingGoalRepository, times(1)).findById(1L);
//        verify(savingGoalRepository, times(1)).save(existingSavingGoal);
//    }
//
//    @Test
//    public void testDeleteSavingGoal() {
//        savingGoalService.deleteSavingGoal(1L);
//        verify(savingGoalRepository, times(1)).deleteById(1L);
//    }
//}

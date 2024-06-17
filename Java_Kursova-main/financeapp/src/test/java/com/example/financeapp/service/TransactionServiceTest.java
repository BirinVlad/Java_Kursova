//package com.example.financeapp.service;
//
//import com.example.financeapp.model.Transaction;
//import com.example.financeapp.repository.TransactionRepository;
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
//public class TransactionServiceTest {
//
//    @Mock
//    private TransactionRepository transactionRepository;
//
//    @InjectMocks
//    private TransactionService transactionService;
//
//    @Test
//    public void testAddTransaction() {
//        Transaction transaction = new Transaction();
//        transaction.setAmount(100.0);
//
//        when(transactionRepository.save(transaction)).thenReturn(transaction);
//
//        Transaction newTransaction = transactionService.addTransaction(transaction);
//
//        assertNotNull(newTransaction);
//        assertEquals(100.0, newTransaction.getAmount());
//        verify(transactionRepository, times(1)).save(transaction);
//    }
//
//    @Test
//    public void testUpdateTransaction() {
//        Transaction existingTransaction = new Transaction();
//        existingTransaction.setId(1L);
//        existingTransaction.setAmount(100.0);
//
//        Transaction updatedTransaction = new Transaction();
//        updatedTransaction.setAmount(200.0);
//
//        when(transactionRepository.findById(1L)).thenReturn(Optional.of(existingTransaction));
//        when(transactionRepository.save(existingTransaction)).thenReturn(existingTransaction);
//
//        Transaction result = transactionService.updateTransaction(1L, updatedTransaction);
//
//        assertNotNull(result);
//        assertEquals(200.0, result.getAmount());
//        verify(transactionRepository, times(1)).findById(1L);
//        verify(transactionRepository, times(1)).save(existingTransaction);
//    }
//
//    @Test
//    public void testDeleteTransaction() {
//        transactionService.deleteTransaction(1L);
//        verify(transactionRepository, times(1)).deleteById(1L);
//    }
//}

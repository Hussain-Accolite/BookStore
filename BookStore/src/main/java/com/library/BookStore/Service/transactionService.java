package com.library.BookStore.Service;

import com.library.BookStore.Model.transactionHistory;

import java.util.List;

public interface transactionService {

    List<transactionHistory> getAllTransactions();
    List<transactionHistory> getByUserId(long userId);
    //void addTransaction(transactionHistory tH);

}

package com.library.BookStore.Repositry;

import com.library.BookStore.Model.transactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface transactionRepositry extends JpaRepository<transactionHistory,Long> {

    List<transactionHistory> findByUserId(long userId);
}

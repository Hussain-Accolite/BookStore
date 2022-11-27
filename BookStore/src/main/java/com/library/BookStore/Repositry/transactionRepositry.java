package com.library.BookStore.Repositry;

import com.library.BookStore.Model.transactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface transactionRepositry extends JpaRepository<transactionHistory,Long> {
}

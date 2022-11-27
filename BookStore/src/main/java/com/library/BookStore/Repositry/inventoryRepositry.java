package com.library.BookStore.Repositry;

import com.library.BookStore.Model.booksInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface inventoryRepositry extends JpaRepository<booksInventory,Long> {
    booksInventory findBybookName(String bookName);
}
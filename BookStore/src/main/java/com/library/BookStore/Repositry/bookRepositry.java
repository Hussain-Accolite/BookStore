package com.library.BookStore.Repositry;

import com.library.BookStore.Model.books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepositry extends JpaRepository<books,Long> {
}

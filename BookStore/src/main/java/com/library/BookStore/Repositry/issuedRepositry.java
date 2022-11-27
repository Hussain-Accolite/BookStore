package com.library.BookStore.Repositry;

import com.library.BookStore.Model.issuedBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface issuedRepositry extends JpaRepository<issuedBooks,Long> {
}

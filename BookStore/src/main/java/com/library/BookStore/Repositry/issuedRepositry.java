package com.library.BookStore.Repositry;

import com.library.BookStore.Model.issuedBooks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface issuedRepositry extends JpaRepository<issuedBooks,Long> {
    List<issuedBooks> findByUserId(long UserId);
}

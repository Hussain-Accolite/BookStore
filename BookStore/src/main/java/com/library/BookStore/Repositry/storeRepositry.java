package com.library.BookStore.Repositry;

import com.library.BookStore.Model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface storeRepositry extends JpaRepository<user,Long> {
}

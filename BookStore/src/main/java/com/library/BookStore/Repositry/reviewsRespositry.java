package com.library.BookStore.Repositry;


import com.library.BookStore.Model.reviews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface reviewsRespositry extends JpaRepository<reviews,Long> {
    public List<reviews> findBybookName(String bookName);
}

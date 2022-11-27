package com.library.BookStore.Repositry;


import com.library.BookStore.Model.reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface reviewsRespositry extends JpaRepository<reviews,Long> {
}

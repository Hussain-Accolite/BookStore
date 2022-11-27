package com.library.BookStore.Service;

import com.library.BookStore.Model.reviews;

import java.util.List;

public interface reviewService {
    reviews uploadReviews(reviews r);
    List<reviews> getAllReviews();
    List<reviews> getReviewOfId(String bookName);

    reviews disLike(long id,reviews r);
}

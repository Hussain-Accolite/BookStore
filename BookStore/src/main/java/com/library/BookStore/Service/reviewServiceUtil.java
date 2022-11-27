package com.library.BookStore.Service;

import com.library.BookStore.Model.reviews;
import com.library.BookStore.Repositry.reviewsRespositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class reviewServiceUtil implements reviewService {
    @Autowired
    public reviewsRespositry rvp;

    @Override
    public reviews uploadReviews(reviews r) {
        return this.rvp.save(r);
    }

    @Override
    public List<reviews> getAllReviews() {
        return this.rvp.findAll();
    }

    @Override
    public List<reviews> getReviewOfId(String bookName) {
        return this.rvp.findBybookName(bookName);
    }

    @Override
    public reviews disLike(long id, reviews r) {
        Optional<reviews> opt = this.rvp.findById(id);
        if (opt.isPresent()) {
            reviews r1 = opt.get();
            r1.setDislikes(r1.getDislikes() + 1);
            if (r1.getDislikes() >= 3) {
                reviews r2 = new reviews();
                this.rvp.save(r2);
            } else {
                return this.rvp.save(r1);
            }
        }
        else {
            return null;
        }
        return null;
    }
}


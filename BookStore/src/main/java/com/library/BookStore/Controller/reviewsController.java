package com.library.BookStore.Controller;

import com.library.BookStore.Model.reviews;
import com.library.BookStore.Service.reviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class reviewsController {
    @Autowired
    private reviewService res;

    @PostMapping(path="/addReview")
    private ResponseEntity<reviews> addReviews(@RequestBody reviews r){
        return ResponseEntity.ok().body(this.res.uploadReviews(r));
    }

    @GetMapping(path="/getAllRevies")
    private ResponseEntity<List<reviews>> getReviews(){
        return ResponseEntity.ok().body(this.res.getAllReviews());
    }

    @GetMapping(path="/getReviewOfBook/{bookName}")
    private ResponseEntity<List<reviews>> getReview(@PathVariable String bookName){
        return ResponseEntity.ok().body(this.res.getReviewOfId(bookName));

    }

    @PutMapping(path="/dislike/{rId}")
    private ResponseEntity<reviews> setDislike(@PathVariable long rId,@RequestBody reviews r){
        return ResponseEntity.ok().body(this.res.disLike(rId,r));
    }
}

package com.library.BookStore.Controller;

import com.library.BookStore.Model.books;
import com.library.BookStore.Service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class booksController {
    @Autowired
    private bookService bService;

    @PostMapping(path = "/addBooks")
    private ResponseEntity<books> addBooks(books b){
        return ResponseEntity.ok().body(this.bService.setBook(b));
    }

    @GetMapping(path = "/getAllBooks")
    private ResponseEntity<List<books>> getAllBooks(){
        return ResponseEntity.ok().body(this.bService.getAllBooks());
    }

    @GetMapping(path = "/getBookById/{bookId}")
    private ResponseEntity<books> getBookById(@PathVariable long bookId){
        return ResponseEntity.ok().body(this.bService.getBook(bookId));
    }

    @PutMapping(path = "/giveALike/{bookId}")
    private ResponseEntity<books> hitLike(@PathVariable long bookId){
        return ResponseEntity.ok().body((this.bService.setLikes(bookId)));
    }


}

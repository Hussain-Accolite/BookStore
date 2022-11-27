package com.library.BookStore.Controller;

import com.library.BookStore.Model.issuedBooks;
import com.library.BookStore.Service.issuedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class issuedBooksController {
    @Autowired
    private issuedService iss;

    @GetMapping(path="/allIssuedBooks")
    private ResponseEntity<List<issuedBooks>> getAllBooksIssued(){
        return ResponseEntity.ok().body(this.iss.showAllIssued());
    }
    @GetMapping(path="/allIssuedBooks/{userId}")
    private ResponseEntity<List<issuedBooks>> getIssuedBooks(@PathVariable long userId){
        return ResponseEntity.ok().body(this.iss.returnUserHistory(userId));
    }
    @PostMapping(path="/issueABook")
    private ResponseEntity<issuedBooks> issueAbook(@RequestBody issuedBooks issuedbooks){

        return ResponseEntity.ok().body(this.iss.issueAbook(issuedbooks));
    }

    @PutMapping(path="/returnABook/{tId}")
    private ResponseEntity<issuedBooks> returnBook(@PathVariable long tId,@RequestBody issuedBooks ib){
        ib.settId(tId);
        return ResponseEntity.ok().body(this.iss.returnAbook(ib));
    }
}

package com.library.BookStore.Controller;

import com.library.BookStore.Model.transactionHistory;
import com.library.BookStore.Service.transactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class transactionHistoryController {

    @Autowired
    private transactionService ths;
    @GetMapping(path="/getMoneyTransactions")
    private ResponseEntity<List<transactionHistory>> getAllTrans(){
        return ResponseEntity.ok().body(this.ths.getAllTransactions());
    }

    @GetMapping(path="/getMoneyTransactions/{userId}")
    private ResponseEntity<List<transactionHistory>> getAllTransUser(@PathVariable long userId){
        return ResponseEntity.ok().body(this.ths.getByUserId(userId));
    }

}

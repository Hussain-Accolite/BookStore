package com.library.BookStore.Controller;

import com.library.BookStore.Model.booksInventory;
import com.library.BookStore.Service.inventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class booksInventoryController {
    @Autowired
    private inventoryService ivs;

    @GetMapping(path = "/getAllInventory")
    private ResponseEntity<List<booksInventory>> getAllInventory() {
        return ResponseEntity.ok().body(this.ivs.getAllInventory());
    }

    @GetMapping(path = "/getByNameInventory/{bookName}")
    private ResponseEntity<booksInventory> getBookInventory(@PathVariable String bookName) {
        return ResponseEntity.ok().body(this.ivs.getByName(bookName));
    }
}

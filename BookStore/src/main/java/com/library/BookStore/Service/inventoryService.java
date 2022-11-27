package com.library.BookStore.Service;

import com.library.BookStore.Model.booksInventory;
import com.library.BookStore.Repositry.bookRepositry;
import com.library.BookStore.Repositry.inventoryRepositry;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class inventoryService {
    @Autowired
    public inventoryRepositry ir;
    @Autowired
    public bookRepositry br;

    public List<booksInventory> getAllInventory(){
        return this.ir.findAll();
    }

    public booksInventory updateCount(){
        br.count()
    }
}

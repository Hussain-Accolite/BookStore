package com.library.BookStore.Service;

import com.library.BookStore.Model.booksInventory;
import com.library.BookStore.Repositry.bookRepositry;
import com.library.BookStore.Repositry.inventoryRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class inventoryService {
    @Autowired
    public inventoryRepositry ir;

    public List<booksInventory> getAllInventory(){
        return this.ir.findAll();
    }
    public booksInventory getByName(String bookName){
        return this.ir.findBybookName(bookName);
    }
//    public booksInventory updateCount(){
//        br.count()
//    }
}

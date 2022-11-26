package com.library.BookStore.Controller;


import com.library.BookStore.Model.user;
import com.library.BookStore.Service.storeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class stroreController {
    @Autowired
    private storeService service;

    @PostMapping(path = "/addUser")
    private ResponseEntity<user> saveUser(@RequestBody user u){
        return ResponseEntity.ok().body(this.service.setUser(u));
    }
    @GetMapping(path="/user")
    private ResponseEntity<List<user>> dispUsers(){
        return  ResponseEntity.ok().body(this.service.getUsers());
    }

    @GetMapping(path="/user/{userId}")
    private ResponseEntity<user> dispUser(@PathVariable int userId){
        return ResponseEntity.ok().body(this.service.getUserById(userId));
    }

    @PutMapping("/update/{userId}")
    private ResponseEntity<user> updateUser(@PathVariable int userId,@RequestBody user u){
        u.setUserId(userId);
        return ResponseEntity.ok().body(this.service.updateUser(u));
    }

    @PutMapping("/updateStatus/{userId}")
    private ResponseEntity<user> updateUserStatus(@PathVariable int userId,@RequestBody user u) {
        u.setUserId(userId);
        return ResponseEntity.ok().body(this.service.suspendUser(u));
    }


}

package com.library.BookStore.Service;

import com.library.BookStore.Model.user;

import java.util.List;

public interface storeService {

    user setUser(user u);
    user updateUser(user u);
    List<user> getUsers();
    user getUserById(long id);
    user suspendUser(user u);

}

package com.library.BookStore.Service;

import com.library.BookStore.Model.books;

import java.util.List;

public interface bookService {
    books setBook(books b);
    List<books> getAllBooks();
    books getBook(long id);
    books setLikes(long id);
}

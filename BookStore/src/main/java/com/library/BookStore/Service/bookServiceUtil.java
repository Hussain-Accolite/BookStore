package com.library.BookStore.Service;

import com.library.BookStore.Model.books;
import com.library.BookStore.Model.user;
import com.library.BookStore.Repositry.bookRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class bookServiceUtil implements bookService{

    @Autowired
    public bookRepositry bookrepositry;
    @Override
    public books setBook(books b) {
        return bookrepositry.save(b);
    }

    @Override
    public List<books> getAllBooks() {
        return bookrepositry.findAll();
    }

    @Override
    public books getBook(long id) {
        Optional<books> Obj = this.bookrepositry.findById(id);
        if (Obj.isPresent()) {
            return Obj.get();
        } else {
            return null;
        }
    }

    @Override
    public books setLikes(long id) {
        Optional<books> Obj = this.bookrepositry.findById(id);
        if (Obj.isPresent()){
            books b1 = Obj.get();
            b1.setLikes(b1.getLikes()+1);
            return bookrepositry.save(b1);
        }
        else{
        return null;
    }
}
}


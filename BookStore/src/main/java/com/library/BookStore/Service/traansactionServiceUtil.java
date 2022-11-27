package com.library.BookStore.Service;

import com.library.BookStore.Model.transactionHistory;
import com.library.BookStore.Repositry.transactionRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class traansactionServiceUtil implements transactionService{
    @Autowired
    private transactionRepositry  tr;
    @Override
    public List<transactionHistory> getAllTransactions() {
        return this.tr.findAll();
    }

    @Override
    public List<transactionHistory> getByUserId(long UserId) {
        return this.tr.findByUserId(UserId);
    }
}

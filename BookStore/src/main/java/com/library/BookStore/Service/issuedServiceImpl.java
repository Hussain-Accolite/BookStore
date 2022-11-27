package com.library.BookStore.Service;

import com.library.BookStore.Model.*;
import com.library.BookStore.Repositry.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class issuedServiceImpl implements issuedService{

    @Autowired
    private issuedRepositry irepo;

    @Autowired
    private bookRepositry bR;
    @Autowired
    private storeRepositry sr;
    @Autowired
    private transactionRepositry trepo;

    @Autowired
    private walletRepositry wr;

    @Override
    public issuedBooks issueAbook(issuedBooks b) {

        Optional<books> obj = this.bR.findById(b.getBookId());
        Optional<user> storeObj = this.sr.findById(b.getUserId());
        Optional<wallet> walletObj = this.wr.findById(b.getUserId());
        if (obj.isPresent()){
            books b1 = obj.get();
            user u1 = storeObj.get();
            wallet w = walletObj.get();
            if (w.getMoney() >= b1.getPrice()) {
                long x = 0 - (long) 0.2 * b1.getPrice();
                transactionHistory thhi = new transactionHistory();
                thhi.setAction(x);
                thhi.setUserId(b.getBookId());
                u1.setBooksIssued(u1.getBooksIssued() + 1);
                this.sr.save(u1);
                this.trepo.save(thhi);
                return this.irepo.save(b);
            }
        }
        else {
            return null;
        }
        return null;

    }

    @Override
    public issuedBooks returnAbook(issuedBooks books) {
        Optional<issuedBooks> obj = this.irepo.findById(books.gettId());
        if (obj.isPresent()) {
            Optional<books> bj = this.bR.findById(books.getBookId());
            books b1 = bj.get();
            long x = (long)0.1*b1.getPrice();
            transactionHistory thhi = new transactionHistory();
            thhi.setAction(x);
            thhi.setUserId(b1.getBookId());
            this.trepo.save(thhi);
            issuedBooks book = obj.get();
            return this.irepo.save(book);
        } else {
            return null;
        }
    }

    @Override
    public List<issuedBooks> showAllIssued() {
        return this.irepo.findAll();
    }

    @Override
    public List<issuedBooks> returnUserHistory(long userId) {
        return this.irepo.findByUserId(userId);
    }
}

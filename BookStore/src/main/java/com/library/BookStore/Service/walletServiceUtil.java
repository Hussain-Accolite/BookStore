package com.library.BookStore.Service;


import com.library.BookStore.Model.transactionHistory;
import com.library.BookStore.Model.wallet;
import com.library.BookStore.Repositry.transactionRepositry;
import com.library.BookStore.Repositry.walletRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class walletServiceUtil implements walletService{

    @Autowired
    public walletRepositry repositry;
    @Autowired
    public transactionRepositry tr;
    @Override
    public wallet setMoney(wallet wallet) {
        return this.repositry.save(wallet);
    }

    @Override
    public List<wallet> showAll() {
        return this.repositry.findAll();
    }

    @Override
    public wallet showMoneyId(long Id) {
        Optional<wallet> Obj = this.repositry.findById(Id);
        if (Obj.isPresent()) {
            return Obj.get();
        } else {

            return null;
        }
    }

    @Override
    public wallet addMoney(long Id,wallet w) {
        Optional<wallet> Obj = this.repositry.findById(w.getId());
        if(Obj.isPresent()){
            if(w.getMoney()%500==0){
                transactionHistory th = new transactionHistory();
                th.setUserId(w.getId());
                th.setAction(w.getMoney());
                this.tr.save(th);
                wallet wi = Obj.get();
                wi.setMoney(wi.getMoney()+w.getMoney());
                return this.repositry.save(wi);
            }
        }
        return null;
    }
}

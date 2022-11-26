package com.library.BookStore.Service;

import com.library.BookStore.Model.user;
import com.library.BookStore.Repositry.storeRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class storeServiceUtil implements storeService {

    @Autowired
    public storeRepositry repositry;

    @Override
    public user setUser(user u) {
        return repositry.save(u);
    }

    @Override
    public user updateUser(user u) {
        Optional<user> pObj = this.repositry.findById(u.getUserId());
        if(pObj.isPresent()){
            user ui = pObj.get();
            ui.setUserId(u.getUserId());
            ui.setUserName(u.getUserName());
            ui.setUserStatus(u.getUserStatus());
            ui.setMobileNo(u.getMobileNo());
            ui.setEmailId(u.getEmailId());
            return this.repositry.save(ui);
        }
        else {
            return null;
        }
    }

    @Override
    public List<user> getUsers() {
        return this.repositry.findAll();
    }

    @Override
    public user getUserById(long id) {
        Optional<user> Obj = this.repositry.findById(id);
        if (Obj.isPresent()) {
            return Obj.get();
        } else {
            return null;
        }

    }

    @Override
    public user suspendUser(user u) {
        Optional<user> Obj = this.repositry.findById(u.getUserId());
        if(Obj.isPresent()){
            user ui = Obj.get();
            ui.setUserStatus(u.getUserStatus());
            return this.repositry.save(ui);

        }
        return null;
    }
}

package com.library.BookStore.Model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wallet")
public class wallet {

//    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
//    private user u;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    @Id
    private long Id;

    @Column(name = "balance")
    long balance;

//    public user getU() {
//        return u;
//    }
//
//    public void setU(user u) {
//        this.u = u;
//    }
//    @CreationTimestamp
//    private Date createdTime;
//
//    public Date getCreatedTime() {
//        return createdTime;
//    }
//
//    public void setCreatedTime(Date createdTime) {
//        this.createdTime = createdTime;
//    }

    public long getMoney() {
        return balance;
    }

    public void setMoney(long money) {
        this.balance = money;
    }
}

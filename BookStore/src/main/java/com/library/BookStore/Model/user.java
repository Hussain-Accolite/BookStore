package com.library.BookStore.Model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "userDetails")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    long userId;
    @Column(name ="userName")
    String userName;
    @Column(name = "emailId",unique = true)
    String emailId;
    @Column(name ="mobileNo",unique = true)
    String mobileNo;
    @Column(name = "userStatus")
    String userStatus;

    public int getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(int booksIssued) {
        this.booksIssued = booksIssued;
    }

    @Column(name = "booksIssued")
    int booksIssued;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_id")
//    private  wallet w;
//
//    public wallet getW() {
//        return w;
//    }
//
//    public void setW(wallet w) {
//        this.w = w;
//    }

    @CreationTimestamp
    private Date createdTime;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}

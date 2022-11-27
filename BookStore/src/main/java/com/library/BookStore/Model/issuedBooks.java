package com.library.BookStore.Model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issuedBooks")
public class issuedBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long tId;

    @Column(name = "userId",nullable = false)
    long userId;

    @Column(name = "bookId",nullable = false)
    long bookId;

    @CreationTimestamp
    private Date issuedTime;

    public long gettId() {
        return tId;
    }

    public void settId(long tId) {
        this.tId = tId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public Date getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(Date issuedTime) {
        this.issuedTime = issuedTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    @UpdateTimestamp
    private Date returnTime;
}

package com.library.BookStore.Model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name = "transactions")
public class transactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long tranId;

    @Column(name = "userId")
    long userId;

    @Column(name = "action")
    long action;

    @CreationTimestamp
    private Date timeDate;

    public long getTranId() {
        return tranId;
    }

    public void setTranId(long tranId) {
        this.tranId = tranId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getAction() {
        return action;
    }

    public void setAction(long action) {
        this.action = action;
    }

    public Date getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(Date timeDate) {
        this.timeDate = timeDate;
    }
}

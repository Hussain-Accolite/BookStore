package com.library.BookStore.Model;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long rId;
    @Column(name = "bookName")
    String bookName;
    @Column(name = "review")
    String[] review;

    public long getrId() {
        return rId;
    }

    public void setrId(long rId) {
        this.rId = rId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String[] getReview() {
        return review;
    }

    public void setReview(String[] review) {
        this.review = review;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    @Column(name = "dislikes")
    int dislikes;
}

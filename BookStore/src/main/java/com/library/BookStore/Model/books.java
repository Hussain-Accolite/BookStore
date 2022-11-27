package com.library.BookStore.Model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name = "books")
public class books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long bookId;

    @Column(name = "bookName")
    String bookName;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "author")
    String author;


    @Column(name = "category")
    String category;

    @Column(name = "availability")
    char availability;

    public char getAvailability() {
        return availability;
    }

    public void setAvailability(char availability) {
        this.availability = availability;
    }


    @Column(name = "price")
    long price;

    @Column(name = "likes")
    long like;
    @CreationTimestamp
    private Date createdTime;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getLike() {
        return like;
    }

    public void setLike(long like) {
        this.like = like;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}

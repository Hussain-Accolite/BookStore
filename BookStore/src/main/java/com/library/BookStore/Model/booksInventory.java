package com.library.BookStore.Model;


import javax.persistence.*;

@Entity
@Table(name = "bookInventory")
public class booksInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long bookCId;

    @Column(name = "bookName")
    String bookName;
    @Column(name = "count")
    long count;

    public long getBookCId() {
        return bookCId;
    }

    public void setBookCId(long bookCId) {
        this.bookCId = bookCId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}

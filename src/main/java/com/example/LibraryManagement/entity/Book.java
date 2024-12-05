package com.example.LibraryManagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_book")
    private int idBook;
    private String bookName;
    private String author;
    private String category;
    private int quantity;
    private double price;

    public Book(int idBook, String bookName, String author, String category, int quantity, double price) {
        this.idBook = idBook;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }
    public Book() {

    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package com.example.LibraryManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name="bill")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBill;
    private String bookName;
    private int quantity;
    private String category;
    private double price;

    public int getIbBill() {
        return idBill;
    }

    public void setIbBill(int ibBill) {
        this.idBill = ibBill;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bill(int idBill, String bookName, int quantity, String category, double price) {
        this.idBill = idBill;
        this.bookName = bookName;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
    }
    public Bill() {

    }

}

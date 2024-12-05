package com.example.LibraryManagement.entity;


import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity(name="inventory_report")
public class InventoryReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id_inventory_report")
    private int idExceptionReport;

    @Column(name="book")
    private String book;

    @Column(name="first_inventory")
    private int firstInventory;

    @Column(name="arise")
    private String arise;

    @Column(name="last_inventory")
    private int lastInventory;

    public InventoryReport(int idExceptionReport, String book, int firstInventory, String arise, int lastInventory) {
        this.idExceptionReport = idExceptionReport;
        this.book = book;
        this.firstInventory = firstInventory;
        this.arise = arise;
        this.lastInventory = lastInventory;
    }

    public int getIdExceptionReport() {
        return idExceptionReport;
    }

    public void setIdExceptionReport(int idExceptionReport) {
        this.idExceptionReport = idExceptionReport;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getFirstInventory() {
        return firstInventory;
    }

    public void setFirstInventory(int firstInventory) {
        this.firstInventory = firstInventory;
    }

    public String getArise() {
        return arise;
    }

    public void setArise(String arise) {
        this.arise = arise;
    }

    public int getLastInventory() {
        return lastInventory;
    }

    public void setLastInventory(int lastInventory) {
        this.lastInventory = lastInventory;
    }

    public InventoryReport() {
    }
}

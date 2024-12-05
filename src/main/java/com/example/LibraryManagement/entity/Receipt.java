package com.example.LibraryManagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@Data
@Entity(name="receipt")
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_receipt")
    private int idReceipt;
    @Column(name="client_name")
    private String clientName;
    @Column(name="address")
    private String address;
    @Column(name="email")
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;


    private double collectMoney;

    public int getIdReceipt() {
        return idReceipt;
    }

    public void setIdReceipt(int idReceipt) {
        this.idReceipt = idReceipt;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }





    public double getCollectMoney() {
        return collectMoney;
    }

    public void setCollectMoney(double collectMoney) {
        this.collectMoney = collectMoney;
    }

    public Receipt(int idReceipt, String clientName, String address, String email, String phoneNumber,  String collectionDate, double collectMoney) {
        this.idReceipt = idReceipt;
        this.clientName = clientName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;

        this.collectMoney = collectMoney;
    }

    public Receipt() {
    }
}

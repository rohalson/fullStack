package com.example.LibraryManagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_client")
    private int idClient;
    @Column(name="client_name")
    private String clientName;
    private double debt;

    public Client(int idClient, String clientName, double debt) {
        this.idClient = idClient;
        this.clientName = clientName;
        this.debt = debt;
    }

    public Client() {
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
}

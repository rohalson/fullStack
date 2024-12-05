package com.example.LibraryManagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "debt_report")

public class DebtReport {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id_debt_report")
     private int idDebtReport;

     @Column(name="client")
    private String client;

     @Column(name="first_debt")
    private double firstDebt;

    @Column(name="arise")
    private String arise;

    @Column(name="final_debt")
    private double finalDebt;

    public DebtReport(int idDebtReport, String client, double firstDebt, String arise, double finalDebt) {
        this.idDebtReport = idDebtReport;
        this.client = client;
        this.firstDebt = firstDebt;
        this.arise = arise;
        this.finalDebt = finalDebt;
    }

    public DebtReport() {
    }

    public int getIdDebtReport() {
        return idDebtReport;
    }

    public void setIdDebtReport(int idDebtReport) {
        this.idDebtReport = idDebtReport;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getFirstDebt() {
        return firstDebt;
    }

    public void setFirstDebt(int firstDebt) {
        this.firstDebt = firstDebt;
    }

    public String getArise() {
        return arise;
    }

    public void setArise(String arise) {
        this.arise = arise;
    }

    public double getFinalDebt() {
        return finalDebt;
    }

    public void setFinalDebt(int finalDebt) {
        this.finalDebt = finalDebt;
    }
}

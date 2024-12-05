package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.DebtReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebtReportRepository extends JpaRepository<DebtReport,Integer> {
}

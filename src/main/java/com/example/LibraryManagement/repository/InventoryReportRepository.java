package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.InventoryReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryReportRepository extends JpaRepository<InventoryReport,Integer> {
}

package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.InventoryReport;
import com.example.LibraryManagement.repository.InventoryReportRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryReportService {
    @Autowired
    InventoryReportRepository inventoryReportRepository;
    public List<InventoryReport> getAllInventoryReports() {
        return inventoryReportRepository.findAll();
    }


}

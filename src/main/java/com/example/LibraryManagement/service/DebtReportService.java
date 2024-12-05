package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.DebtReport;
import com.example.LibraryManagement.repository.DebtReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebtReportService {
    @Autowired
    DebtReportRepository debtReportRepository;
    public List<DebtReport> getAllDebtReports() {
        return debtReportRepository.findAll();  // Lấy tất cả các bản ghi từ database
    }
}

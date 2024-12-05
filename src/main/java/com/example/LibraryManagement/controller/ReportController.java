package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.entity.DebtReport;
import com.example.LibraryManagement.entity.InventoryReport;
import com.example.LibraryManagement.service.DebtReportService;
import com.example.LibraryManagement.service.InventoryReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ReportController {
    @Autowired
    DebtReportService debtReportService;

    @Autowired
    InventoryReportService inventoryReportService;

    @GetMapping("/debt-report")
    public String showDebtReport(Model model) {
        List<DebtReport> debtReports = debtReportService.getAllDebtReports(); // Lấy danh sách báo cáo nợ
        model.addAttribute("debtReports", debtReports);  // Đưa danh sách vào model để hiển thị lên view
        return "debtReport";  // Tên file HTML mà Thymeleaf sẽ render
    }

    @GetMapping("/inventory-report")
    public String showInventoryReport(Model model) {

        List<InventoryReport> inventoryReports = inventoryReportService.getAllInventoryReports();

        model.addAttribute("inventoryReports", inventoryReports);

        return "inventoryReport";
    }

}

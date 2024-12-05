package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt,Integer> {
}

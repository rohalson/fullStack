package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {

}

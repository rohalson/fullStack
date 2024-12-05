package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.Book;
import com.example.LibraryManagement.repository.BillRepository;
import com.example.LibraryManagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillService {
    @Autowired
    BillRepository billRepository;
    BookRepository booksRepository;

}

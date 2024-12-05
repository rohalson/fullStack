package com.example.LibraryManagement.service;

import com.example.LibraryManagement.entity.Book;
import com.example.LibraryManagement.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
//    BookService booksRepository;//tai sao day? sao lai goi chinh no
    BookRepository booksRepository;
//    @Transactional
//    public List<Book> findByName(String bookName){
//          return   booksRepository.findByName("%"+bookName+"%");
//    }
    @Transactional
    public List<Book> findByBookNameLike(String bookName){
        return booksRepository.findByBookNameLike(bookName);
    }
    public boolean addBook(Book book) {
        if (book.getQuantity() <= 150) {
            throw new IllegalArgumentException("Số lượng nhập phải ít hơn 150");
        }

        long totalBooksInStock = booksRepository.count();
        if (totalBooksInStock <= 300) {
            throw new IllegalArgumentException("Số sách trong kho phải dưới 300");
        }

        booksRepository.save(book);
        return true;
    }

    public BookService(BookRepository bookRepository) {
        this.booksRepository = bookRepository;
    }

    // Phương thức lấy tất cả sách
    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }
    public Book getBookById(int idBook) {
        return booksRepository.findById(idBook).orElse(null);  // Tìm sách theo id
    }

    public void saveBook(Book book) {
        booksRepository.save(book);  // Lưu thông tin sách sau khi cập nhật
    }
}

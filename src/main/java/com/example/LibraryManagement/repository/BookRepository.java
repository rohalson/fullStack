package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Integer> {
    @Query("select b from Book b where b.bookName like :bookName")
    List<Book> findByName(@Param("bookName") String bookName);
//    @Query("SELECT b FROM Book b WHERE b.bookName LIKE %:keyword%")
//    List<Book> findByBookNameContaining(@Param("keyword") String keyword);


    List<Book> findByBookNameLike(String bookName);
     long countByCategory(String category);

    Optional<Book> findById(int idBook);

}

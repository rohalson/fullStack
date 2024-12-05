package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.entity.Book;
import com.example.LibraryManagement.service.BillService;
import com.example.LibraryManagement.service.BookService;
import com.example.LibraryManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    BookService booksService;


    @GetMapping("/search")
    public String searchBooks(@RequestParam("bookName") String bookName, Model model) {
        List<Book> books = booksService.findByBookNameLike(bookName);
        model.addAttribute("books", books);
        return "listBook.html";
    }

    @PostMapping("/addBook")
    public String addBook(Book book, Model model) {
        try {
            booksService.addBook(book);
            model.addAttribute("message", "Sách đã được thêm thành công");
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "home.html"; // Tên của view (HTML/JSP) để hiển thị kết quả
    }

    @PostMapping("/submit-debt")
    public String submitDebt(@RequestParam("debtAmount") double debtAmount, Model model) {
        if (debtAmount > 20000) {
            return "home.html";
        } else {
            return "searchById.html";
        }
    }
    @GetMapping("/allBooks")
    public String listAllBooks(Model model) {
        List<Book> books = booksService.getAllBooks();
        model.addAttribute("books", books);
        return "listAll.html"; // Tên file Thymeleaf: listAll.html
    }

    // Bước 1: Tìm sách theo id và chuyển đến trang nhập số lượng
    @GetMapping("/searchById")
    public String searchBookById(@RequestParam("idBook") int idBook, Model model) {
        Book book = booksService.getBookById(idBook);  // Tìm sách theo id
        if (book != null) {
            model.addAttribute("book", book);
            return "enterQuantity.html";  // Chuyển hướng đến trang nhập số lượng nếu tìm thấy sách
        } else {
            model.addAttribute("notFound", true);  // Hiển thị thông báo không tìm thấy sách
            return "searchById.html";  // Quay lại trang tìm kiếm nếu không tìm thấy sách
        }
    }
    @PostMapping("/purchaseBook")
    public String purchaseBook(@RequestParam("idBook") int idBook,
                               @RequestParam("quantity") int purchaseQuantity, Model model) {
        Book book = booksService.getBookById(idBook);  // Lấy thông tin sách từ database
        if (book != null && book.getQuantity() >= purchaseQuantity) {
            // Trừ số lượng sách trong cơ sở dữ liệu
            book.setQuantity(book.getQuantity() - purchaseQuantity);
            booksService.saveBook(book);  // Cập nhật lại cơ sở dữ liệu

            // Tính tổng số tiền mua
            double totalPrice = purchaseQuantity * book.getPrice();

            // Truyền thông tin sách và tổng số tiền vào model để hiển thị hóa đơn
            model.addAttribute("book", book);
            model.addAttribute("quantity", purchaseQuantity);
            model.addAttribute("totalPrice", totalPrice);

            return "bill.html";  // Chuyển hướng đến trang hóa đơn
        } else {
            model.addAttribute("error", "Số lượng không đủ hoặc sách không tồn tại.");
            return "enterQuantity.html";  // Quay lại trang nhập số lượng nếu xảy ra lỗi
        }
    }
}

package com.example.LibraryManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "home.html";
    }
    @GetMapping("/sellBook")
    public String sellBook() {
        return "sellBook.html";
    }
//
    @GetMapping("/addBook")
    public String addBook() {
        return "addBook.html";
    }
    @GetMapping("/list")
        public String showList(){
            return "listBook.html";
        }
  @GetMapping("/debt")
    public String debt(){
        return "debt.html";
  }
  @GetMapping("/bill")
    public String bill(){
        return "bill.html";
  }
}

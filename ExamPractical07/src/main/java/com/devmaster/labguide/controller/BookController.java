package com.devmaster.labguide.controller;

import com.devmaster.labguide.entity.Book;
import com.devmaster.labguide.service.BookService;
import com.devmaster.labguide.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BookService bookService;

    @GetMapping
    public String listAllBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book/book-list";
    }

    @GetMapping("/create")
    public String showBookForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "book/book-form";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("book", bookService.getBookById(id).orElse(null));
        model.addAttribute("categories", categoryService.getAllCategories());
        return "book/book-form";
    }

    @PostMapping("/create")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/book";
    }

    @PostMapping("/create/{id}")
    public String updateBook(@PathVariable Long id, @ModelAttribute Book book) {
        book.setId(id);
        bookService.saveBook(book);
        return "redirect:/book";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return "redirect:/book";
    }
}

package com.devmaster.lesson08.controller;

import com.devmaster.lesson08.entity.Author;
import com.devmaster.lesson08.entity.Book;
import com.devmaster.lesson08.service.AuthorService;
import com.devmaster.lesson08.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;

    private static final String UPLOAD_DIR = "src/main/resources/static/";

    private static final String UPLOAD_PartFile = "images/products/";

    //hien toan bo danh sach
    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBook());
        return "books/book-list";
    }

    //them moi danh sach
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("authors", authorService.getAllAuthors());
        return "books/book-form";
    }
    @PostMapping("/new")
    public String saveBook(@ModelAttribute Book book, @RequestParam List<Long> authorIds,@RequestParam("imageBook") MultipartFile imageFile) {
        if (!imageFile.isEmpty()) {
            try {
                //tao thu muc neu chua ton tai
                Path uploadPath = Paths.get(UPLOAD_DIR + UPLOAD_PartFile);
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }
                //lay phan mo rong cua file anh
                String originalFileName = StringUtils.cleanPath(imageFile.getOriginalFilename());
                String fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));

                //luu file len server
                //String originalFileName = StringUtils.cleanPath(imageFile.getOriginalFilename());
                //Part filePart = uploadPath.resolve(fileName);

                //tao ten file moi + phan mo rong goc
                String newFileName = book.getCode() + fileExtension;
                Path filePath = uploadPath.resolve(newFileName);
                Files.copy(imageFile.getInputStream(), filePath);

                //luu duong dan anh vao thuoc tinh imgUrl cua Book
                book.setImgUrl("/" + UPLOAD_PartFile + newFileName);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<Author> authors = new ArrayList<>(authorService.findAllById(authorIds));
        book.setAuthors(authors);
        bookService.saveBook(book);
        return "redirect:/books";
    }

    //form sua thong tin book
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        model.addAttribute("authors", authorService.getAllAuthors());
        return "books/book-form";
    }
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }
}

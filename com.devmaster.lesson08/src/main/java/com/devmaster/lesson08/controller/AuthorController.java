package com.devmaster.lesson08.controller;

import com.devmaster.lesson08.entity.Author;
import com.devmaster.lesson08.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    private static final String UPLOAD_DIR = "src/main/resources/static/";

    private static final String UPLOAD_PartFile = "images/authors/";

    @GetMapping
    public String getAllAuthors(Model model) {
        model.addAttribute("authors", authorService.getAllAuthors());
        return "authors/author-list";
    }

    @GetMapping("/create")
    public String showAuthorForm(Model model) {
        model.addAttribute("author", new Author());
        return "authors/author-form";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("author", authorService.getAuthorById(id));
        return "authors/author-form";
    }

    @PostMapping("/create")
    public String saveAuthor(@ModelAttribute("author") Author author) {
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }

    @PostMapping("/create/{id}")
    public String updateAuthor(@PathVariable Long id ,@ModelAttribute Author author) {
        author.setId(id);
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }

    @GetMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable("id") Long id) {
        authorService.deleteAuthorById(id);
        return "redirect:/authors";
    }
}

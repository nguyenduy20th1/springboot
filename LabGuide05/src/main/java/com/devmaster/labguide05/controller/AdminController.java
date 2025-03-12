package com.devmaster.labguide05.controller;

import com.devmaster.labguide05.entity.User;
import com.devmaster.labguide05.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String listUser(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "admin/users";
    }
    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "admin/user_form";
    }
    @GetMapping("/up/{id}")
    public String updateUser(@PathVariable Long id , Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "admin/user_form";
    }

    @PostMapping("/save")
    public String saveUser(User user) {
        userService.saveUser(user);
        return "redirect:/admin/users";
    }

    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/admin/users";
    }
}

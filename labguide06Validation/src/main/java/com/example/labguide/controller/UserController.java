package com.example.labguide.controller;

import com.example.labguide.entity.User;
import com.example.labguide.repository.UserRepository;
import com.example.labguide.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @GetMapping
    public String listUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "user/list";
    }
    @GetMapping("/new")
    public String createUserForm(Model model) {
        User user = new User();
        user.setIsActive(true);
        model.addAttribute("user", user);
        return "user/form";
    }
    @PostMapping("/save")
    public String saveUser(@Validated @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (userRepository.existsByUsername(user.getUsername()) && user.getId() == null) {
            result.rejectValue("username", "error.user", "Username đã tồn tại, vui lòng chọn tên khác");
            return "user/form";
        }
        if (result.hasErrors()) {
            return "user/form";
        }
        userService.saveUser(user);
        return "redirect:/users";
    }
    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable Long id, Model model) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user id : " + id));
        model.addAttribute("user", user);
        return "user/form";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "redirect:/users";
    }
}

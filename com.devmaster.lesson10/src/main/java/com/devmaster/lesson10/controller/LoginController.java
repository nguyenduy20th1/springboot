package com.devmaster.lesson10.controller;

import com.devmaster.lesson10.entity.User;
import com.devmaster.lesson10.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        HttpServletRequest req,
                        Model model) {
        if (error != null) {
            Object errorMsg = req.getSession().getAttribute("loginError");
            model.addAttribute("loginError", (errorMsg != null) ? errorMsg.toString() : "Sai tên đăng nhập hoặc mật khẩu!");
        }
        return "login";
    }


    @GetMapping("/register")
    public String register(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register")
    public String register(User user, Model model) {
        User existingUser = userRepository.findByUsername(user.getUsername()).orElse(null);
        if (existingUser != null) {
            model.addAttribute("messageExistingUser", "Username is already taken");
            return "register";
        }
        User newUser = new User();
        newUser.setFullname(user.getFullname());
        newUser.setUsername(user.getUsername());
        newUser.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(newUser);
        return "redirect:/login";
    }
}

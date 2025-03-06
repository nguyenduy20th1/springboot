package com.devmaster.lesson05.controller;

import com.devmaster.lesson05.entity.Info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping
    public String index() {
        return "index";
    }
    @GetMapping("/profile")
    public String profile(Model model) {
        List<Info> profile = new ArrayList<>();
        profile.add(new Info("John Doe", "dev", "contact@devmaster.edu.vn", "https://devmaster.edu.vn"));
        model.addAttribute("DevmasterProfile", profile);
        return "profile";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Devmaster: Home");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Devmaster: About");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Devmaster: Contact");
        return "contact";
    }
}

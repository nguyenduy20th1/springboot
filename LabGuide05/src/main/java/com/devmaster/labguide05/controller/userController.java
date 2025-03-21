package com.devmaster.labguide05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userController {
    @GetMapping("/home")
    public String home() {
        return "user/home";
    }
    @GetMapping("/about")
    public String about() {
        return "user/about";
    }
    @GetMapping("address")
    public String address() {
        return "user/address";
    }
}

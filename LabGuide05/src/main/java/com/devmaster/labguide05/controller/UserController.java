package com.devmaster.labguide05.controller;

import com.devmaster.labguide05.dto.UserDTO;
import com.devmaster.labguide05.entity.User;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class UserController {
    @GetMapping
    public String home() {
        return "home";
    }
    @GetMapping("/home")
    public ResponseEntity<String> newUser(@Valid @RequestBody UserDTO userDTO, Model model) {
        userDTO.addUser
        model.addAttribute("title", "Devmaster: Home Page");
        return "newUser";
    }
    public String updateUser(User user) {

        return "updateUser";
    }
}

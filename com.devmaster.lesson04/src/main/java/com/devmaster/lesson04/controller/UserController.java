package com.devmaster.lesson04.controller;


import com.devmaster.lesson04.dto.UserDTO;
import com.devmaster.lesson04.entity.User;
import com.devmaster.lesson04.service.UsersService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@NoArgsConstructor
public class UserController {
    @Autowired
    UsersService usersService;

    @GetMapping("/user-list")
    public List<User> getAllUsers() {
        return usersService.findAll();
    }
    @PostMapping("/user-add")
    public ResponseEntity<String> addUser(@Valid @RequestBody UserDTO user) {
        usersService.create(user);
        return ResponseEntity.ok("User created successfully");
    }
}

package org.example.lesson02.pkg_automation.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
//    @Autowired
//    private final UserService userService;
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    public String getUser() {
//        return userService.getUserDetail();
//    }

    @GetMapping("/users")
    public String users() {
        return "<h1>Get all users</h1>";
    }

    @PostMapping("/users/{id}")
    public String createUser() {
        return "<h1>User created</h1>";
    }

    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable int id) {
        return "<h1>User with ID " + id + "update</h1>";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        return "<h1>User with ID " + id + "delete</h1>";
    }
}

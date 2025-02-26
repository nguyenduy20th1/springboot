package org.example.lesson02.pkg_automation.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyParamController {
    @GetMapping("my-param")
    public String searchUsers(@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return "<h2>No name provided, returning all users</h2>";
        }
        return "<h1>Searching for users with name " + name + "</h1>";
    }

    public String getUserById(@PathVariable(required = false) String id) {
        return "<h1>User ID is " + id + "</h1>";
    }
}

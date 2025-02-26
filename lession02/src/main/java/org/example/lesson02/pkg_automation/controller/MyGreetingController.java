package org.example.lesson02.pkg_automation.controller;

import org.example.lesson02.pkg_automation.service.MyGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyGreetingController {
    @Autowired
    private final MyGreetingService mygreetingService;
    public MyGreetingController(MyGreetingService greetingService) {
        this.mygreetingService = greetingService;
    }
    @GetMapping("/my-greet")
    public String greet() {
        return mygreetingService.greet();
    }
}

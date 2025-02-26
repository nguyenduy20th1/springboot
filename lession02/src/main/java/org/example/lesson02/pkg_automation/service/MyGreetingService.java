package org.example.lesson02.pkg_automation.service;

import org.springframework.stereotype.Service;

@Service
public class MyGreetingService {
    public String greet() {
        return "<h1>Hello from MyGreetingService!</h1>";
    }
}

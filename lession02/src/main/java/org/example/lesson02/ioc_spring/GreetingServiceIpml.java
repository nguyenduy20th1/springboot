package org.example.lesson02.ioc_spring;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceIpml implements GreetingService {
    public String greet(String name) {
        return "<h2>DevMaster SpringBoot! Xin chào, </h2>" + "<h1 style='color:red' text-align='center'>" + name;
    }
}

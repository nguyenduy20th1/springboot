package org.example.lesson02.pkg_automation.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String appName() {
        return "<h1>Viện công nghệ DevMaster</h1>" +
                "<h2>Spring Boot Application";
    }
}

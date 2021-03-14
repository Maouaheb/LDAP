package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRessource {
    @GetMapping("/")
    public String index() {
        return "Welcome to the Spring Security LDAP Authentication Guide!";
    }
}

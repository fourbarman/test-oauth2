package ru.fourbarman.oauth2.spring.testoauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/login")
    public String work() {
        return "login work";
    }

    @GetMapping("/internal")
    public String internal() {
        return "internal work";
    }
}

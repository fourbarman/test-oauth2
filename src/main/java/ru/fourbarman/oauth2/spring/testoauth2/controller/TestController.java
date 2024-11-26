package ru.fourbarman.oauth2.spring.testoauth2.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/delete")
    @PreAuthorize("hasRole('admin')")
    public String delete() {
        return "delete work";
    }

    @GetMapping("/add")
    @PreAuthorize("hasRole('admin')")
    public String internal() {
        return "add work";
    }

    @GetMapping("/view")
    @PreAuthorize("hasRole('user')")
    public String view() {
        return "view work";
    }
}

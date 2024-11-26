package ru.fourbarman.oauth2.spring.testoauth2.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/delete/{id}")
    @PreAuthorize("hasRole('admin')")
    public String delete(@PathVariable String id, @AuthenticationPrincipal Jwt jwt) {
        System.out.println("jwt = " + jwt.getClaims());
        System.out.println("id = " + id);
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

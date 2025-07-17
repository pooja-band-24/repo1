package com.javachap.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogoutController {

    @PostMapping("/logout")
    public String logout(HttpServletRequest request) {
        // Implementation goes here
        return "login";
    }
}
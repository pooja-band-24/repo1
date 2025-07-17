package com.javachap.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javachap.domain.User;
import com.javachap.service.UserService;
import com.javachap.web.model.LoginForm;

@RestController
public class LoginController {

    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody LoginForm loginForm, HttpServletRequest request) {
        // Implementation goes here
        return "home";
    }
}
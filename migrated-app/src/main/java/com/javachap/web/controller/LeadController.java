package com.javachap.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javachap.domain.Category;
import com.javachap.domain.Lead;
import com.javachap.domain.User;
import com.javachap.service.LeadService;
import com.javachap.web.model.LeadForm;

@RestController
public class LeadController {

    @Autowired
    private LeadService leadService;

    @PostMapping("/lead")
    public String createLead(@RequestBody LeadForm leadForm, HttpServletRequest request) {
        // Implementation goes here
        return "home";
    }
}
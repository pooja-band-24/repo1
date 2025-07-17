package com.javachap.web.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javachap.web.model.LanguageForm;

@RestController
public class LanguageController {

    @PostMapping("/language")
    public String setLanguage(@RequestBody LanguageForm languageForm, HttpServletRequest request) {
        Locale locale;
        if (("french").equals(languageForm.getLanguage())) {
            locale = Locale.FRENCH;
        } else {
            locale = Locale.ENGLISH;
        }
        request.getSession().setAttribute("display", locale);
        return "leadListing";
    }
}
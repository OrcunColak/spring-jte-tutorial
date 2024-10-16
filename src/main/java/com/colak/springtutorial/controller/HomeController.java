package com.colak.springtutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // http://localhost:8080/
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name","World");

        return "index";
    }
}
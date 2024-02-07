package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String getHome(Model model) {
        model.addAttribute("message", "Hello World");
        return "index";
    }

    @GetMapping("style")
    public String style(Model model) {
        model.addAttribute("message", "Hello World");
        return "add-css-js-demo";
    }
}

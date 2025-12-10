package com.example.school.controller;

import com.example.school.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    // --- Hiện có ---
    @GetMapping("/")
    public String index() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam(required = false) String username, 
                          @RequestParam(required = false) String password, 
                          Model model) {
        // Logic đăng nhập tạm thời
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }
}

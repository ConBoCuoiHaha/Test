package com.example.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

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
        // Giả lập logic đăng nhập: cứ bấm là vào được
        // Ở đây để lại chỗ trống để các bạn có thể thực hành code thêm logic check user/pass sau này
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }
}

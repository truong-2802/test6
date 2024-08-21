package com.example.test6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Đây là tên của view (thường là một file Thymeleaf HTML)
    }

    @GetMapping("/employees")
    public String employeesPage() {
        return "employees"; // Tương tự, tên của view cho trang employees
    }
}


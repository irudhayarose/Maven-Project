package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "view"; // loads login page
    }

    @PostMapping("/login")
    @ResponseBody
    public String handleLogin(@RequestParam String username,
                              @RequestParam String password) {

        // Simple validation (hardcoded)
        if(username.equals("admin") && password.equals("1234")) {
            return "Login Successful!";
        } else {
            return "Invalid Username or Password";
        }
    }
}
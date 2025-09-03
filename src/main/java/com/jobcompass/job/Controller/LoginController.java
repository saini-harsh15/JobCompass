package com.jobcompass.job.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm(@RequestParam(value = "error", required = false) String error,
                                Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Invalid username or password");
        }
        return "login"; // resolves to /WEB-INF/views/login.jsp
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {
        // Dummy check – replace with real authentication
        if ("admin".equals(username) && "password".equals(password)) {
            return "redirect:/home";  // successful login
        } else {
            model.addAttribute("errorMessage", "Invalid credentials. Try again.");
            return "login";
        }
    }
}

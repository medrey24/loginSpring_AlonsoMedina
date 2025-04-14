package com.example.loginform.controller;

import com.example.loginform.model.User;
import com.example.loginform.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador que maneja las solicitudes GET y POST del login.
 */
@Controller
public class LoginController {

    @Autowired
    private AuthService authService;

    /**
     * Muestra el formulario de login.
     */
    @GetMapping("/inicio")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    /**
     * Procesa el formulario de login.
     */
    @PostMapping("/inicio")
    public String login(@ModelAttribute User user, Model model) {
        if (authService.isValidUser(user.getUsername(), user.getPassword())) {
            model.addAttribute("username", user.getUsername());
            return "home";
        } else {
            model.addAttribute("error", "Inicio de sesión incorrecto.");
            return "login";
        }
    }
}

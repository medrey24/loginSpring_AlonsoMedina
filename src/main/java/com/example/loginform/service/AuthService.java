package com.example.loginform.service;

import org.springframework.stereotype.Service;

/**
 * Servicio que valida las credenciales del usuario.
 */
@Service
public class AuthService {

    /**
     * Método que valida las credenciales. 
     * Actualmente solo acepta un usuario fijo: "usuario" y contraseña "1234"
     */
    public boolean isValidUser(String username, String password) {
        return "usuario".equals(username) && "1234".equals(password);
    }
}

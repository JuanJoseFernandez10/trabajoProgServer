package com.application.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.application.Entitys.Profesor;
import com.application.Repository.PracticaRepository;
import com.application.Repository.ProfesorRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

    @Autowired
    private ProfesorRepository profesorRepo;
    @Autowired
    private PracticaRepository practicarRepo;


    @GetMapping({"/", "/login"})
    public String mostrarLogin() {
        return "login";  // o "index"
    }

    @PostMapping("/procesar-login")
    public String procesarLogin(
            @RequestParam String email,
            @RequestParam String password,
            HttpSession session,
            RedirectAttributes redirect) {

        Optional<Profesor> optProf = profesorRepo.findByEmail(email);

        if (optProf.isEmpty()) {
            redirect.addFlashAttribute("error", "Email no encontrado");
            return "redirect:/login";
        }

        Profesor profesor = optProf.get();
        
        profesor.setPracticas(practicarRepo.findByProfesor(profesor));

        if (!(password.equals( profesor.getContraseña()))) {
            redirect.addFlashAttribute("error", "Contraseña incorrecta");
            return "redirect:/login";
        }

        // Login OK → guardamos en sesión
        session.setAttribute("profesor", profesor);
        session.setAttribute("rol", profesor.isDirectiva());

        return "redirect:/home";  // o donde quieras ir después
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
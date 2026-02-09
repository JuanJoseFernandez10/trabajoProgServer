package com.application.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {   // o añádelo a AuthController o donde prefieras

    @GetMapping("/home")
    public String mostrarHome() {
        return "home";   // ← carga templates/home.html
    }
}

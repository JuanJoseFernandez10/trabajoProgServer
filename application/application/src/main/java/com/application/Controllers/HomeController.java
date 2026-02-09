package com.application.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.application.Entitys.Profesor;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {   // o añádelo a AuthController o donde prefieras

	@GetMapping("/home")
	public String home(HttpSession session, Model model) {
	    
	    Profesor profesor = (Profesor) session.getAttribute("profesor");
	    
	    model.addAttribute("profesor", profesor);
	    
	    model.addAttribute("rol", profesor.isDirectiva());  
	    
	    return "home";
	}
}

package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {
	@GetMapping({"/","inicio",})
	public String index(Model model) {
		return "index";
	}
	
	//Página funciones
	@GetMapping({"/funcion"})
	public String menuFuncion(Model model) {
		return "forms/funcion";
	}

}

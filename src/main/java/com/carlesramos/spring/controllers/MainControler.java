package com.carlesramos.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.carlesramos.spring.services.EmpleadoService;

@Controller
public class MainControler {
	
	@Autowired
	private EmpleadoService service;
	
	@GetMapping({"/", "empleado/list"})
	public String listado(Model model) {
		model.addAttribute("listaEmpleados", service);
		return "list";
	}
	
}

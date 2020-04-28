package com.uca.capas.Tarea3_NCapas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.Tarea3_NCapas.domain.Student;

@Controller
public class MainController {
	
	@GetMapping("/ingresar")
	public String enviarForm(Student student) {
		return "ingreso";
	}
	
	@PostMapping("/formData")
	public ModelAndView procesar(Student student) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("correcto");
		mav.addObject("student", student);
		
		return mav;
	}
}

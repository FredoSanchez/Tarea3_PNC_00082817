package com.uca.capas.Tarea3_NCapas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public ModelAndView procesar(@Valid @ModelAttribute Student student, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("incorrecto");
		}else {
			mav.setViewName("correcto");
			mav.addObject("student", student);
		}		
		
		return mav;
	}
}

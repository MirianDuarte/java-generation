package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivo")

public class ObjetivosController {
	
	@GetMapping 
	public String bsm() {
		return  "Objetivos de aprendizagem semanais:\n"
				+ "1- Java - POO \n"
				+ "2- Sprint Boot\n"
				+ "3- MySQL Workbench \n"
				+ "4- Inglês - Kultivi";
	}
}
package com.springboot.hello.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/exercicio")


public class HelloController {
	//Exercício 1
	
	@GetMapping ("/ativ1")
	public String habilidadesMentelidades() {
		return "Habilidades: Orientação aos detalhes e pesistência";
	}
	
	//Exercício 2
	@GetMapping ("/ativ2")
	public String objetivosSemana() {
		return "Desenvolver habilidades usando o Spring boot";
	}
}

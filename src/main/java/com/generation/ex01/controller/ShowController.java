package com.generation.ex01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
public class ShowController {

	@GetMapping
	public String Hello() {
		return "<h1>Hello world<h1>"
				+ "<br>"
				+ "<h3>My names is pedro<h3>"; 
	}
	
	@GetMapping("/BSM")
	public String BSM() {
		return "  <title>BSM'S</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
				+ "integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">"
				+ "<h1>BSM'S<h1>"
				+ "<body>"
				+ "<div class='row'>"
				+ "<div class='col'>"
				+ "</div>"
				+ "<div class='col'>"
				+ "<h3>\r\n"
				+ "<li>Persistência</li>"
				+ "<li>Mentalidade de Crescimento</li>"
				+ "<li>Responsabilidade Pessoal</li>"
				+ "<li>Orientação ao Futuro</li>"
				+ "<li>Orientação ao Detalhe </li>"
				+ "<li>Trabalho em Equipe</li>"
				+ "<li>Comunicação</li>"
				+ "<li>Proatividade</li>"
				+ "<h3>"
				+ "</div>"
				+ "<div class='col'>"
				+ "</div>"; 
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "  <title>objetivos</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
				+ "integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">"
				+ "<h1>objetivos<h1>"
				+ "<body>"
				+ "<div class='row'>"
				+ "<div class='col'>"
				+ "</div>"
				+ "<div class='col'>"
				+ "<h3>"
				+ "<br>1	-	Melhor comunicacao com meus colegas de grupo\r\n"
				+ "<br>2	-	tentar participar mais do discord\r\n"
				+ "<br>3	-	organizar objetivos para dezembro\r\n"
				+ "<br>4	-	finalizar tarefas atrasadas \r\n"
				+ "<h3>"
				+ "</div>"
				+ "<div class='col'>"
				+ "</div>"; 
	}
}

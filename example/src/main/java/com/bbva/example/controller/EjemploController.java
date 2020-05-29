package com.bbva.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bbva.example.model.ObjetoSalida;
import com.bbva.example.model.RestApiExampleObject;
import com.bbva.example.service.ExampleService;

@RestController
public class EjemploController {
	
	@Autowired
	ExampleService service;

	@PostMapping(path = "/bbva/mostrar", consumes = "application/json", produces = "application/json")
	public List<ObjetoSalida> reestructurar(@RequestBody RestApiExampleObject restApiExampleObject) {
		
		List<ObjetoSalida> listaReestructurada = service.reestructurar(restApiExampleObject);
		
		return listaReestructurada;
	}
}
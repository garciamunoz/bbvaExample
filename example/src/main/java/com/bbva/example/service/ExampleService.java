package com.bbva.example.service;

import java.util.List;
import com.bbva.example.model.ObjetoSalida;
import com.bbva.example.model.RestApiExampleObject;

public interface ExampleService {

	public abstract List<ObjetoSalida> reestructurar(RestApiExampleObject restApiExampleObject); 
}

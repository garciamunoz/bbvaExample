package com.bbva.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bbva.example.model.Data;
import com.bbva.example.model.ObjetoSalida;
import com.bbva.example.model.RestApiExampleObject;

@Service
public class ExampleServiceImpl implements ExampleService {

	
	public List<ObjetoSalida> reestructurar(RestApiExampleObject restApiExampleObject) {
		
		List<ObjetoSalida> listaReestructurada = new ArrayList<ObjetoSalida>();
		
		for(Data data: restApiExampleObject.getData()) {
			ObjetoSalida objetoSalida = new ObjetoSalida(data.getId(), data.getEmployeeName());
			listaReestructurada.add(objetoSalida);
		}
		
		return listaReestructurada;
	}

}

package com.bbva.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjetoSalida {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("employee_name")
	private String employeeName;
	
	public ObjetoSalida(String id, String employeeName) {
		this.id = id;
		this.employeeName = employeeName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	
}

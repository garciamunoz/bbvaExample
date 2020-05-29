package com.bbva.example.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestApiExampleObject {

	@JsonProperty("status")
	private String status;
	
	@JsonProperty("data")
	private List<Data> data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}
}

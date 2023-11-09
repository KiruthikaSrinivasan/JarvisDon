package com.example.demo;

import java.util.List;

public class LoginDTO {

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	private List<String> names;
	
	private String responseMessage;

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}

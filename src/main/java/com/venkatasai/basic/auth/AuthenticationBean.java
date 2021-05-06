package com.venkatasai.basic.auth;

public class AuthenticationBean {
	
	private String message;

	public AuthenticationBean(String message) {
		this.message=message;
	}

	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorld [message=%s]", message);
	}
	
	

}

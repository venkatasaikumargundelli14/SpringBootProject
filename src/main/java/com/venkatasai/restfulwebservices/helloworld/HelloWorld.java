package com.venkatasai.restfulwebservices.helloworld;

public class HelloWorld {
	
	private String message;

	public HelloWorld(String message) {
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

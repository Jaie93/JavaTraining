package com.springdemo.Springdemo;

public class ConstructorMessage {
	
	private String message;
	
	public ConstructorMessage(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return "ConstructorMessage [message=" + message + "]";
	}
	
	

}

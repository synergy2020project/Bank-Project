package com.bank.bank;

public class ExceptionBank extends RuntimeException{

	public ExceptionBank(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ExceptionBank(String message) {
		super(message);
		
	}
	
	

}

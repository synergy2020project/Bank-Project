package com.bank.bank;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class bankVendorExceptionHandler {
	private Throwable exceptionBank;

	@ExceptionHandler(value = {ExceptionBank.class})
	public ResponseEntity<BankVendorException> handleExceptionBank
	(ExceptionBank excepionBank)
	{
		exceptionBank = null;
		BankVendorException bankVendorException = new BankVendorException(
				exceptionBank.getMessage(),
				exceptionBank.getCause(),
				HttpStatus.NOT_FOUND
				);
		return new ResponseEntity<>(bankVendorException, HttpStatus.NOT_FOUND);
		
		
	}

}

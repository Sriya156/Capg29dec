package com.cg.ovs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**This class handles payment not found exceptions and throws an error message in case an exception occurs*/
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PaymentNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public PaymentNotFoundException() 
	{
		super();
	}
	
	public PaymentNotFoundException(String errMsg)
	{
		super(errMsg);
	}
}

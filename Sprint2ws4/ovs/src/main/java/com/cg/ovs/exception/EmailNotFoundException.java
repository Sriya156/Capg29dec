package com.cg.ovs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmailNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmailNotFoundException()
	{
		super();
	}

	public EmailNotFoundException(String errorMsg)
	{
		super(errorMsg);
	}
}
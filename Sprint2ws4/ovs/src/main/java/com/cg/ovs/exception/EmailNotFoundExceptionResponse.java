package com.cg.ovs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)public class EmailNotFoundExceptionResponse 
{
	private String emailResponse;

	public String getEmailResponse() {
		return emailResponse;
	}

	public void setEmailResponse(String emailResponse) {
		this.emailResponse = emailResponse;
	}

	public EmailNotFoundExceptionResponse(String emailResponse) {
		super();
		this.emailResponse = emailResponse;
	}
	
}

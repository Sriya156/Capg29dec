package com.cg.ovs.exception;

public class UserEmailExceptionResponse {
	private String emailId;

	public UserEmailExceptionResponse (String emailId) {
		super();
		this.emailId= emailId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	

}
package com.cg.ovs.exception;

public class PaymentNotFoundExceptionResponse {
	
	private String paymentId;

	public PaymentNotFoundExceptionResponse(String paymentId) {
		super();
		this.paymentId = paymentId;
	}

	public String getProjectNotFound() {
		return paymentId;
	}

	public void setProjectNotFound(String paymentId) {
		this.paymentId = paymentId;
	}
}
	

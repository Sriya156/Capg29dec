package com.cg.ovs.exception;

public class PaymentNotFoundExceptionResponse {
	
	private String paymentId;

	public PaymentNotFoundExceptionResponse(String paymentId) {
		super();
		this.paymentId = paymentId;
	}

	public String getPaymentNotFound() {
		return paymentId;
	}

	public void setPaymentNotFound(String paymentId) {
		this.paymentId = paymentId;
	}
}
	

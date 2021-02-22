package com.cg.ovs.exception;


public class PaymentIdExceptionResponse
{
	private String paymentId;

	public PaymentIdExceptionResponse(String paymentId) 
	{
		super();
		this.paymentId = paymentId;
	}

	public String getPaymentIdentity() 
	{
		return paymentId;
	}

	public void setPaymentIdentity(String paymentId)
	{
		this.paymentId = paymentId;
	}

}
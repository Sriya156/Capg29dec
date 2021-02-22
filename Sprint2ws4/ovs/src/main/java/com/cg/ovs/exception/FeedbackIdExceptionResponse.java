package com.cg.ovs.exception;

public class FeedbackIdExceptionResponse {
	private String feedbackId;

	public FeedbackIdExceptionResponse(String feedbackId) 
	{
		this.feedbackId = feedbackId;
	}

	public String getFeedbackId() {
		return feedbackId;
	}

	
}

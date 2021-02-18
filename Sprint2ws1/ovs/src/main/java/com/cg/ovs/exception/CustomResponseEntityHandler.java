package com.cg.ovs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@RestController
public class CustomResponseEntityHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<Object> handlePaymentIdException(PaymentIdException ex, WebRequest request){
		PaymentIdExceptionResponse paymentIdExceptionResponse =  new PaymentIdExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(paymentIdExceptionResponse,HttpStatus.BAD_REQUEST);
	}	
	
	@ExceptionHandler
	public ResponseEntity<Object> handlePaymentNotFoundException(PaymentNotFoundException ex, WebRequest request){
		PaymentNotFoundExceptionResponse paymentNotFoundExceptionResponse =  new PaymentNotFoundExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(paymentNotFoundExceptionResponse,HttpStatus.BAD_REQUEST);
	}
	
}

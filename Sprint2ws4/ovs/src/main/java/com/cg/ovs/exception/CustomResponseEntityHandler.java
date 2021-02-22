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
	
	@ExceptionHandler
	public ResponseEntity<Object> handleOrderNoException(OrderNoException ex, WebRequest request){
		OrderNoExceptionResponse orderNoExceptionResponse =  new OrderNoExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(orderNoExceptionResponse,HttpStatus.BAD_REQUEST);
	}	
	
	@ExceptionHandler
	public ResponseEntity<Object> handleOrderNotFoundException(OrderNotFoundException ex, WebRequest request){
		OrderNotFoundExceptionResponse orderNotFoundExceptionResponse =  new OrderNotFoundExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(orderNotFoundExceptionResponse,HttpStatus.BAD_REQUEST);
	}	
	@ExceptionHandler
	public ResponseEntity<Object> handleEmailException(UserEmailException ex, WebRequest request){
		UserEmailExceptionResponse userEmailExceptionResponse =  new UserEmailExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(userEmailExceptionResponse,HttpStatus.BAD_REQUEST);
	}	
	@ExceptionHandler
	public ResponseEntity<Object> handleEmailNotFoundException(EmailNotFoundException ex, WebRequest request){
		EmailNotFoundExceptionResponse emailNotFoundException =  new EmailNotFoundExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(emailNotFoundException,HttpStatus.BAD_REQUEST);
	}	
	@ExceptionHandler
	public final  ResponseEntity<Object> handleFeedbackIdException(FeedbackIdException ex, WebRequest request){
		FeedbackIdExceptionResponse f= new FeedbackIdExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(f,HttpStatus.BAD_REQUEST);
	}

}

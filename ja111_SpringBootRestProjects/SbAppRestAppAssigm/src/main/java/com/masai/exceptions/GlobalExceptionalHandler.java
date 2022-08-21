package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionalHandler {

	
	@ExceptionHandler(InvalidURIException.class)
	public ResponseEntity<MyErrorDetails> myHandelr1(InvalidURIException iue, WebRequest wr){
		   MyErrorDetails er=new MyErrorDetails();
	        er.setTime(LocalDateTime.now());
	        er.setMsg(iue.getMessage());
	        er.setDetails(wr.getDescription(false));
			
			return new ResponseEntity<MyErrorDetails>(er,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NullValueException.class)
	public ResponseEntity<MyErrorDetails> myHandelr1(NullValueException nue, WebRequest wr){
		   MyErrorDetails er=new MyErrorDetails();
	        er.setTime(LocalDateTime.now());
	        er.setMsg(nue.getMessage());
	        er.setDetails(wr.getDescription(false));
			
			return new ResponseEntity<MyErrorDetails>(er,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ProductNotFound.class)
	public ResponseEntity<MyErrorDetails> myHandelr1(ProductNotFound pnf, WebRequest wr){
		   MyErrorDetails er=new MyErrorDetails();
	        er.setTime(LocalDateTime.now());
	        er.setMsg(pnf.getMessage());
	        er.setDetails(wr.getDescription(false));
			
			return new ResponseEntity<MyErrorDetails>(er,HttpStatus.BAD_REQUEST);
	}
	
	
}

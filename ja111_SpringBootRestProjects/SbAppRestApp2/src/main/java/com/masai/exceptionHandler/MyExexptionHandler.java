package com.masai.exceptionHandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.masai.exception.IlligalRollNumberException;
import com.masai.exception.MyErrorDetails;

@ControllerAdvice
public class MyExexptionHandler {
@ExceptionHandler(IlligalRollNumberException.class)
	
    public ResponseEntity<MyErrorDetails> myExceptionHandler(IlligalRollNumberException ia, WebRequest wr) {
        MyErrorDetails er=new MyErrorDetails();
        er.setTime(LocalDateTime.now());
        er.setMsg(ia.getMessage());
        er.setDetails(wr.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(er,HttpStatus.BAD_REQUEST);
	
	}


@ExceptionHandler(Exception.class)
	public ResponseEntity<String> myExceptionHandler2(Exception ia) {
	    System.out.println("Inside handler method..");
		
		return new ResponseEntity<String>(ia.getMessage(),HttpStatus.BAD_REQUEST);
	
	}

}

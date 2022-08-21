package com.masai.exceptions;

public class InvalidURIException extends RuntimeException{
     public InvalidURIException() {
    	 
     }
     public InvalidURIException(String massage) {
    	 super(massage);
     }
}

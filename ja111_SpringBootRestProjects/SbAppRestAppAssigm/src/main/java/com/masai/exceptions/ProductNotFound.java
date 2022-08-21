package com.masai.exceptions;

public class ProductNotFound extends RuntimeException{
	
     public ProductNotFound() {
    	 
     }
     public ProductNotFound(String massage) {
    	 super(massage);
     }
}

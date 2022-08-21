package com.masai.exceptions;

public class NullValueException extends RuntimeException{
	public NullValueException() {
		
	}
	public NullValueException(String massage) {
		super (massage);
	}

}

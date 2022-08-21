package com.masai.AccException;

public class InvalidAccount extends Exception{
	public InvalidAccount() {
			
	}
	
	public InvalidAccount(String message) {
		super(message);
	}
}

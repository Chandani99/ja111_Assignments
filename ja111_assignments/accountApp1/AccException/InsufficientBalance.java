package com.masai.AccException;

public class InsufficientBalance extends Exception{
	public InsufficientBalance() {
			
		}
		
	public InsufficientBalance(String message) {
		super(message);
	}
}

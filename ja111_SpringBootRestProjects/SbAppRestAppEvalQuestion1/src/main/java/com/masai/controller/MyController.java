package com.masai.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Book;
import com.masai.exceptions.InvalidId;
import com.masai.exceptions.NullValueException;

@RestController
public class MyController {
	
	@GetMapping("/books")
	public List<Book> getAllBook(){
	
		return Arrays.asList(
				new Book(10, "java", "Ram", 400),
				new Book(11, "java", "Ram", 400),
				new Book(12, "java", "Ram", 400),
				new Book(13, "java", "Ram", 400));
	}
	
	@GetMapping("/books/{bid}")
	public Book getBook(@PathVariable("bid") Integer bid){
		if(bid<10) {
			throw new InvalidId("Id should be greater than 10");
		}
		
		Book b=new Book(bid, "java", "Ram", 400);
		return b;
	}
	
	@PostMapping("/book")
	public String saveBook(@RequestBody Book b){
		
		if(b==null) {
			throw new NullValueException("There is no value");
		}
		
		return "book added" +b;
	}
	
	@DeleteMapping("/book/{bid}")
	public String deleteBook(@RequestBody Book b, @PathVariable ("roll") Integer bid){
		
		if(bid<10) {
			throw new InvalidId("Id should be greater than 10");
		} 
		
		if(b==null) {
			throw new NullValueException("There is no value");
		}
		
		return "book deleted" +b;
	}
	
	
	
	

}

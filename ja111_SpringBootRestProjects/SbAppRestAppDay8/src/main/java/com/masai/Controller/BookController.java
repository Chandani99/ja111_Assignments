package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Book;
import com.masai.Service.AuthorService;
import com.masai.Service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	
	private BookService bService;
	
	@PostMapping("")
	public Book saveBook(@RequestBody Book book) {
		return bService.saveBook(book);
	}
	
	@GetMapping("/{id}")
	public Book viewBookHandler(@PathVariable("id") Integer id) {
		return bService.viewBook(id);
		
	}
	
	@GetMapping("")
	public List<Book> viewAllBookHandler(){
		return bService.viewAllBook();
	}
	
	@DeleteMapping("/{id}")
	
	public String deleteBookHnadler(@PathVariable("id") Integer id) {
		return bService.deleteBook(id);
	}
	
	@PutMapping("/{id}")
	public Book updateBookHandler(@PathVariable("id") Integer id,@RequestBody Book book) {
		return bService.updateBook(id, book);
	}

}

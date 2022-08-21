package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Author;
import com.masai.Service.AuthorService;
import com.masai.Service.BookService;

@RestController
public class AuthorController {
     @Autowired
	 private AuthorService aService;
     @Autowired
     private BookService bService;
     
     @PostMapping("/author")
     public Author saveAuthor(@RequestBody Author author) {
    	 return aService.saveAuthor(author);
     }
}

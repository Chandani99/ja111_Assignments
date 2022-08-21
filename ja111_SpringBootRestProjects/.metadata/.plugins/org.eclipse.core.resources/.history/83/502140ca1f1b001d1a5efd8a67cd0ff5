package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entity.Author;
import com.masai.Entity.Book;
import com.masai.Repository.AuthorDao;
import com.masai.Repository.BookDao;

@Service
public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	private AuthorDao aDao;
	
	@Autowired
	private BookDao bDao;

	@Override
	public Author saveAuthor(Author author) {
		
		List<Book> books=author.getBooks();
		for(Book b:books) {
			bDao.save(b);
		}
		return aDao.save(author);
	}

}

package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entity.Author;
import com.masai.Entity.Book;
import com.masai.Repository.AuthorDao;
import com.masai.Repository.BookDao;


@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bDao;
	
	@Autowired
	private AuthorDao aDao;

	@Override
	public Book saveBook(Book book) {
		
		aDao.save(book.getAuthor());
		return bDao.save(book);
	}

	@Override
	public Book viewBook(Integer id) {
		Optional<Book> books=bDao.findById(id);
		return books.get();
	}

	@Override
	public List<Book> viewAllBook() {
		List<Book> books=bDao.findAll();
		return books;
	}

	@Override
	public String deleteBook(Integer id) {
//		List<Book> allBooks=bDao.findAll();
//		for(int i=0; i<allBooks.size(); i++) {
//			Book book=allBooks.get(i);
//			if(book.getBid()==id) {
//				bDao.delete(allBooks.get(i));
//			}
//		}
		
		bDao.deleteById(id);
		return "Deleted";
	}

	@Override
	public Book updateBook(Integer id, Book book) {
		Optional<Book> books=bDao.findById(id);
		book.setBid(id);
		bDao.save(book);
		return book;
	}

}

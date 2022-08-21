package com.masai.BookDao;

import java.util.List;

import com.masai.Entities.Book;
import com.masai.Entities.Book_Genre;
import com.masai.Exceptions.GenreNotFound;
import com.masai.Exceptions.BookNotFound;

public interface LibraryDao {
	boolean addBook(Book book);
	boolean addGenre(Book_Genre bookGenre);
	List<Book> getBooksByGenre(String genre) throws GenreNotFound;
	String updateAuthorName(String bookName, String authorName) throws BookNotFound;
	void removeGenre(String genre) throws GenreNotFound;
	void removeBook(String bookName) throws BookNotFound;
}

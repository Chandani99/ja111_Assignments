package com.masai.useCases;

import com.masai.BookDao.LibraryDao;
import com.masai.BookDao.LibraryDaoImpl;
import com.masai.Entities.Book;
import com.masai.Entities.Book_Genre;

public class AddBook_Gener {

	public static void main(String[] args) {
		LibraryDao ld=new LibraryDaoImpl();
		
		Book_Genre bg= new Book_Genre();
		Book b1=new Book();
		
		b1.setAuthor_name("Ram");
		b1.setBook_name("Atomic Habit");
		b1.setPublished_date("22-07-022");
		
		Book b2=new Book();
		b2.setAuthor_name("Raju");
		b2.setBook_name("Atomic Habit1");
		b2.setPublished_date("22-07-022");
		
		
		
		bg.setGenre_name("ABC");
		bg.getBookList().add(b1);
		bg.getBookList().add(b2);
		
		ld.addGenre(bg);

		

	}

}

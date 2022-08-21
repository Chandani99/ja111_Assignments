package com.masai.useCases;

import com.masai.BookDao.LibraryDao;
import com.masai.BookDao.LibraryDaoImpl;
import com.masai.Entities.Book;

public class Add_Book {

	public static void main(String[] args) {
		LibraryDao ld=new LibraryDaoImpl();
        Book b1=new Book();
		
		b1.setAuthor_name("Charan");
		b1.setBook_name("Atomic Habit3");
		b1.setPublished_date("22-07-022");
		
		Book b2=new Book();
		b2.setAuthor_name("Shyam");
		b2.setBook_name("Atomic Habit3");
		b2.setPublished_date("22-07-022");
		
		ld.addBook(b2);
		ld.addBook(b1);

	}

}

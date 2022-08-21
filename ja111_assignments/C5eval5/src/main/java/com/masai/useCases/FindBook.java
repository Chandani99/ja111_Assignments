package com.masai.useCases;

import java.util.List;
import java.util.Scanner;

import com.masai.BookDao.LibraryDao;
import com.masai.BookDao.LibraryDaoImpl;
import com.masai.Entities.Book;
import com.masai.Exceptions.GenreNotFound;



public class FindBook {

	public static void main(String[] args) {
		LibraryDao ld=new LibraryDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book name");
		String bname=sc.next();
		
		try {
			List<Book> b=ld.getBooksByGenre(bname);
			
			System.out.println(b);
		} catch (GenreNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.masai.useCases;

import java.util.Scanner;

import com.masai.BookDao.LibraryDao;
import com.masai.BookDao.LibraryDaoImpl;
import com.masai.Exceptions.BookNotFound;

public class RemoveBook {

	public static void main(String[] args) {
		LibraryDao ld=new LibraryDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book name");
		String bname=sc.next();
		try {
			ld.removeBook(bname);
			System.out.println("Removed book");
		} catch (BookNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

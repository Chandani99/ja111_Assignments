package com.masai.useCases;

import java.util.Scanner;

import com.masai.BookDao.LibraryDao;
import com.masai.BookDao.LibraryDaoImpl;
import com.masai.Exceptions.BookNotFound;

public class UpdateGenre {

	public static void main(String[] args) {
		LibraryDao ld=new LibraryDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book name");
		String bname=sc.next();
		
		System.out.println("Enter author name");
		
		String aname=sc.next();
		
		try {
			String x=ld.updateAuthorName(bname, aname);
			
		} catch (BookNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

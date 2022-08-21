package com.masai.useCases;

import java.util.Scanner;

import com.masai.BookDao.LibraryDao;
import com.masai.BookDao.LibraryDaoImpl;
import com.masai.Exceptions.GenreNotFound;

public class RemoveGenre {

	public static void main(String[] args) {
		LibraryDao ld=new LibraryDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Genre name");
		String gname=sc.next();
		try {
			ld.removeGenre(gname);
			System.out.println("Removed");
		} catch (GenreNotFound e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}

}

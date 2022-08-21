package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Entity.Book;

@Service

public interface BookService {
    public Book saveBook(Book book);
    public Book viewBook(Integer id);
    public List<Book> viewAllBook();
    public String deleteBook(Integer id);
    
    public Book updateBook(Integer id, Book book);
}

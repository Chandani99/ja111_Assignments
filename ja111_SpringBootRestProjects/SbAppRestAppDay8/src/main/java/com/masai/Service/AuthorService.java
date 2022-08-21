package com.masai.Service;

import org.springframework.stereotype.Service;

import com.masai.Entity.Author;

@Service
public interface AuthorService {
    public Author saveAuthor(Author author);
}

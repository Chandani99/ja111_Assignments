package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Author;

@Repository
public interface AuthorDao extends JpaRepository<Author, Integer>{

}

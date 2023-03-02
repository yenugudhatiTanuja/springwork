package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
	 Book findBybookId(int id);
}

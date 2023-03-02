package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Book;
import com.spring.repository.BookRepository;

@Service
@Transactional
public class BookService {
	@Autowired
	public BookRepository brepo;

	public List<Book> listAll() {
		return brepo.findAll();
	}

	public Book addBook(Book book) {
		return brepo.save(book);
	}

	public Book findbookById(int id) {
		return brepo.findBybookId(id);
	}
}

package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Book;
import com.spring.service.BookService;

@RestController
public class BookController {
	@Autowired
	public BookService bserv;

	@GetMapping("/booklist")
	public List<Book> getBook(@RequestBody Book book) {
		return this.bserv.listAll();
	}

	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		return this.bserv.addBook(book);
	}
}

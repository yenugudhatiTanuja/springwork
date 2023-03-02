package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Book;
import com.spring.model.Story;
import com.spring.service.BookService;
import com.spring.service.StoryService;

@RestController
public class StoryController {
	@Autowired
	public StoryService stserv;

	@Autowired
	public BookService bookserv;

	@GetMapping("/storylist")
	public List<Story> getStory() {
		return this.stserv.listAll();
	}

	@PostMapping("/addstory")
	public Story addStory(@RequestBody Story story, @RequestParam("bid") int bId) {
		Book book = this.bookserv.findbookById(bId);
		story.setBook(book);
		return this.stserv.addStory(story);
	}
}

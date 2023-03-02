package com.spring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Book {
	
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int bookId;
 private String bName;
 
 @OneToMany(cascade = CascadeType.ALL)
  private List<Story> story  ;
 
public List<Story> getStory() {
	return story;
}

public void setStory(List<Story> story) {
	this.story = story;
}


public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getbName() {
	return bName;
}

public void setbName(String bName) {
	this.bName = bName;
}
}
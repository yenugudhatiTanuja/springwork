package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Story;
import com.spring.repository.StoryRepository;

@Service
@Transactional
public class StoryService {
	@Autowired
	public StoryRepository srepo;

	public List<Story> listAll(){
		return srepo.findAll();
	}
	public Story addStory(Story story) {
		return srepo.save(story);
	}
}

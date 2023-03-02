package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Story;

public interface StoryRepository extends JpaRepository<Story,Integer> {

}

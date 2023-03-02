package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.model.Project;
import com.spring.repository.ProjectRepository;

public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;

	public List<Project> getProjectList() {
		return projectRepository.findAll();
	}
}

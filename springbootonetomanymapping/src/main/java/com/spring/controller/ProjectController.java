package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Project;
import com.spring.service.ProjectService;
@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	 @GetMapping("/projectdetails")
	public List<Project> getProjectDetails(){
		 return this.projectService.getProjectList();
	 }
}

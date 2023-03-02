package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Student;
import com.spring.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	 @GetMapping("/studentdetails")
	public List<Student> getStudentDetails(){
		 return this.studentService.getStudentList();
	 }
}

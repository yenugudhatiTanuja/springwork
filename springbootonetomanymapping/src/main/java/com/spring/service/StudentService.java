package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.model.Student;
import com.spring.repository.StudentRepository;

public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getStudentList() {
		return studentRepository.findAll();
	}
}

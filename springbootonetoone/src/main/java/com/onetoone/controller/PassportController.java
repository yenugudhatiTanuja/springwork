package com.onetoone.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.model.Passport;
import com.onetoone.model.Student;
import com.onetoone.repository.PassportRepository;


@RestController
public class PassportController
{
	@Autowired
	public PassportRepository passportRepository;

	@GetMapping("/passport/{id}")
	public Passport getPassportById(@PathVariable("id") int id)
	{
		Passport passport = passportRepository.findById(id).get();

		return passport;
	}

	@GetMapping("/passports")
	public List<Passport> getAllPassport()
	{
		List<Passport> passportList = new ArrayList<>();
		Iterable<Passport> passport = passportRepository.findAll();

		for (Passport p : passport)
		{
			passportList.add(p);
		}

		return passportList;
	}

	@PostMapping("/passport/{studentid}")
	public Passport createPassport(@PathVariable("studentid") int studentid,
							   @RequestBody Passport passport)
	{
		Student student = passportRepository.getStudent(studentid);
		
		passport.setStudent(student);
		
		passportRepository.save(passport);

		return getPassportById(passport.getId());
	}
	
	@DeleteMapping("/passport/{id}")
	public List<Passport> deletePassport(@PathVariable("id") int id)
	{
		passportRepository.deleteById(id);

		return getAllPassport();
	}
}

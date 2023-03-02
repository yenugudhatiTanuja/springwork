package com.onetoone.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Passport
{	
	@Id
	private int id;
	
	private String number;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;

	public Passport()
	{
		super();
	}

	public Passport(int id, String number, Student student)
	{
		super();
		this.id = id;
		this.number = number;
		this.student = student;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getNumber()
	{
		return number;
	}

	public void setNumber(String number)
	{
		this.number = number;
	}

	public Student getStudent()
	{
		return student;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	@Override
	public String toString()
	{
		return "Passport [id=" + id + ", number=" + number + ", student=" + student + "]";
	}
}	


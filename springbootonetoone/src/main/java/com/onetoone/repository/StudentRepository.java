package com.onetoone.repository;


import org.springframework.data.repository.CrudRepository;

import com.onetoone.model.Student;


public interface StudentRepository extends CrudRepository<Student, Integer>
{

}

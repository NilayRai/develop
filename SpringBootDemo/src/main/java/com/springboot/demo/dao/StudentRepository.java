package com.springboot.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.demo.controller.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}

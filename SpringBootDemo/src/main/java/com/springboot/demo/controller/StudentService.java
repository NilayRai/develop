package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.dao.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deletStudent(Integer sid) {
		studentRepository.delete(sid);
	}

	public Iterable<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student updateStudent(Integer sid, String sex) {

		Student s1 = studentRepository.findOne(sid);
		s1.setSex(sex);
		Student upadedstudent = studentRepository.save(s1);
		return upadedstudent;
	}
}

package com.springboot.demo.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/controller")
public class RestControllerDemo {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML, produces = MediaType.APPLICATION_XML)

	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@RequestMapping(value = "/delete/{sid}", method = RequestMethod.DELETE)

	public void deletStudentById(@PathVariable("sid") Integer sid) {
		studentService.deletStudent(sid);
	}

	@GetMapping(value = "/student/allstudents", produces = MediaType.APPLICATION_XML)
	public Iterable<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@PutMapping(value = "/update/{sid}/{sex}")
	public Student updateStudent(@PathVariable("sid") Integer sid, @PathVariable("sex") String sex) {
		return studentService.updateStudent(sid, sex);
	}
}

package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public int insertData(@RequestBody Student s) {
		return studentService.insertData(s);

	}

	@PutMapping("/update/{id}")
	public int updateData(@RequestBody Student s, @PathVariable("id") int id) {
		return studentService.updattData(s, id);

	}

	@DeleteMapping("/delete/{id}")
	public int deleteData(@RequestBody Student s, @PathVariable("id") int id) {
		return studentService.deleteData(s, id);
	}
}

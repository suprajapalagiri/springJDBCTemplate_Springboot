package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;

	public int insertData(Student s) {
		return studentDao.saveStudent(s);

	}
	public int updattData(Student s,int id) {
		return studentDao.updateStudent(s,id);

	}
	
	public int deleteData(Student s,int id) {
		return studentDao.deleteStudent(s, id);
	}
}

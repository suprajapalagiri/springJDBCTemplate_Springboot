package com.student.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.model.Student;

@Repository
public class StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveStudent(Student s) {
		String query = "insert into Student values(' " + s.getStudent_id() + "','" + s.getStudent_name() + "','"
				+ s.getAddress() + " ')";
		return jdbcTemplate.update(query);

	}
	
	public int updateStudent(Student s,int id) {
		String updateQuery="update student set student_name='"+s.getStudent_name()+"',address='"+s.getAddress()+"'where student_id="+id;
		return jdbcTemplate.update(updateQuery);
	}
	
	public int deleteStudent(Student s,int id) {
		String deleteQuery="delete from student where student_id="+id;
		return jdbcTemplate.update(deleteQuery);
	}
	
	public int getStudent(Student s,int id) {
		String deleteQuery="delete from student where student_id="+id;
		return jdbcTemplate.update(deleteQuery);
	}
}

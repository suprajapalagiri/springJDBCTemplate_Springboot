package com.student.model;

public class Student {
private Integer student_id;
private String student_name;
private String address;

public Integer getStudent_id() {
	return student_id;
}
public void setStudent_id(Integer student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [student_id=" + student_id + ", student_name=" + student_name + ", address=" + address + "]";
}


}

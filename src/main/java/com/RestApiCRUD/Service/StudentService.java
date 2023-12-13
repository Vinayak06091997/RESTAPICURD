package com.RestApiCRUD.Service;

import java.util.List;

import com.RestApiCRUD.Entity.Student;

public interface StudentService {
	
	public String addStudent(Student student);
	
	public Student getStudent(long id);
	
	public List<Student> getAllStudent();
	
	public String updateStudent(Student student);
	
	public String deleteStudent(long id);
	

}

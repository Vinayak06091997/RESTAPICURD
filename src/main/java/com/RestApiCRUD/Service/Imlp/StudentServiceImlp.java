package com.RestApiCRUD.Service.Imlp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.RestApiCRUD.Entity.Student;
import com.RestApiCRUD.Exception.StudentNotFoundException;
import com.RestApiCRUD.Repository.StudentRepository;
import com.RestApiCRUD.Service.StudentService;

@Service
public class StudentServiceImlp implements StudentService{

	
	StudentRepository studentRepository;
	
	public StudentServiceImlp(StudentRepository studentRepository) {
		
		this.studentRepository = studentRepository;
	}


	public String addStudent(Student student) {
	
		studentRepository.save(student);
		return "success added";
	}


	public Student getStudent(long id) 
	{
		if(studentRepository.findById(id).isEmpty()) {
			throw new StudentNotFoundException("Request student does not Exist");
		}
		Student s=studentRepository.findById(id).get();
		return s;
	}
 
	
	public List<Student> getAllStudent() {
		List<Student> s=studentRepository.findAll();
		return s;
	}


	public String updateStudent(Student student) 
	{
		studentRepository.save(student);
		return "Updated successfully";
	}

	
	public String deleteStudent(long id) {
		studentRepository.deleteById(id);
		return "deleted successfully";
	}

}

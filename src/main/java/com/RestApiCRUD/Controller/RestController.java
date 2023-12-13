package com.RestApiCRUD.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.RestApiCRUD.Entity.Student;
import com.RestApiCRUD.Response.ResponseHandler;
import com.RestApiCRUD.Service.StudentService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/students")
public class RestController {

	//Service Instance
	StudentService studentService;
	
	
	public RestController(StudentService studentService) {
	
		this.studentService = studentService;
	}


	
	//Get All Student
	@GetMapping
	public ResponseEntity<Object> getAllStudent(Student student)
	{
		
		List<Student> s=studentService.getAllStudent();
		return 	ResponseHandler.responseBuilder("Requested Student Deatails are",HttpStatus.OK,
				s);
	}
	
	
	//Get Single Student
	@GetMapping("{id}")
	public  ResponseEntity<Object> getStudent(@PathVariable("id") Long id)
	{
		Student student=studentService.getStudent(id);
		
		return 	ResponseHandler.responseBuilder("Requested Student Deatails are",HttpStatus.OK,
				student);
		
	}
	
	//Add Student
	@PostMapping
	public String createStudent(@RequestBody Student student)
	{
		String str=studentService.addStudent(student);
		return str;
	}
	
	
	//Updated Student
	@PutMapping
	public String  updateStudent(@RequestBody Student student)
	{
		String str=studentService.addStudent(student);
		return str;
		
	}
	
	
	//Delete Student
	@DeleteMapping("{id}")
	public String  DeleteStudent(@PathVariable("id") Long id)
	{
		String str=studentService.deleteStudent(id);
		return str;
	}
}


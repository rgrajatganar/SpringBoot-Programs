package com.anudip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.entity.Student;
import com.anudip.entity.Teacher;
import com.anudip.service.StudentService;
import com.anudip.service.TeacherService;

import jakarta.validation.Valid;

@RestController
public class StudentController
{
	@Autowired
	StudentService sservice;
	//come from postman data 
	//ResponseEntity(we use another server thats why we use ResponseEntity) is a returntype of saveTeacher
	//http://localhost:8080/Teacher/addTeacher
	@PostMapping("/Student/addStudent")
	public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student)
	{
		return new ResponseEntity<Student>(sservice.addStudent(student),HttpStatus.CREATED);
		
	}
	//@PathVariable : bind to URI template variable
	//http://localhost:8080/Teacher/get(1)
	@GetMapping("/Student/get/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable ("sid") int sid)
	{
		return new ResponseEntity<Student>(sservice.getStudentDetail(sid),HttpStatus.OK);
	}
	
	// delete
	@DeleteMapping("/Student/remove/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable ("sid") int sid)
	{
		sservice.deleteStudentDetail(sid);
		return new ResponseEntity<String>("Deleted Sucessfully", HttpStatus.OK);
	}
	
	//update
	//@RequestBody : Student object call to JSON file
	@PutMapping("/Student/update/{sid}")
	public ResponseEntity<String> updateStudent(@RequestBody Student student,@PathVariable("sid") int sid) {
	sservice.updateStudentDetail(student,sid); // Delegate to service layer
	return new ResponseEntity<String>("Updated Successfully", HttpStatus.OK);
	
	}
}

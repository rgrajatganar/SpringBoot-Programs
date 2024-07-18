package com.anudip.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.anudip.entity.Student;
import com.anudip.entity.Teacher;
import com.anudip.exception.StudentIdNotFoundException;
import com.anudip.exception.TeacherIdNotFoundException;
import com.anudip.repository.StudentRepository;
import com.anudip.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepository srepo;
	

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return srepo.save(student);
	}

	@Override
	public Student getStudentDetail(int sid) {
		return srepo.findById(sid).
				orElseThrow(()-> new StudentIdNotFoundException("Teacher id is not corrected"));
	}

	@Override
	public Student updateStudentDetail(Student student, int sid) {
		
		Student UpdateStudent = srepo.findById(sid).
				orElseThrow(()-> new StudentIdNotFoundException("Teacher id is not corrected"));
				// set new value
		//Student.setSphone(student.getSphone());
		UpdateStudent.setSphone(student.getSphone());
		UpdateStudent.setSaddr(student.getSaddr());
		srepo.save(UpdateStudent);
		return UpdateStudent;
	}

	@Override
	public void deleteStudentDetail(int sid) {
		Student delStudent =srepo.findById(sid).
				orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
		srepo.delete(delStudent);
		
	}
	
	
	
}

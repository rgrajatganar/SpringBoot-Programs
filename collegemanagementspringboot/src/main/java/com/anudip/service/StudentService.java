package com.anudip.service;

import com.anudip.entity.Student;
import com.anudip.entity.Teacher;

public interface StudentService
{
	// save Student details in db table
		Student addStudent(Student student);
		
		// method to fetch Student detail based on sid from db table
		Student getStudentDetail(int id);
		
		//method to modify Student detail based on sid from db table
		Student updateStudentDetail(Student student, int sid);
		
		//method to remove Student detail based on sid from db table
		void deleteStudentDetail(int sid);
}

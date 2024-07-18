package com.anudip.service;

import com.anudip.entity.Teacher;

public interface TeacherService 
{
	// save teacher details in db table
	Teacher addTeacher(Teacher teacher);
	
	// method to fetch teacher detail based on tid from db table
	Teacher getTeacherDetail(int id);
	
	//method to modify teacher detail based on tid from db table
	Teacher updateTeacherDetail(Teacher teacher, int tid);
	
	//method to remove teacher detail based on tid from db table
	void deleteTeacherDetail(int tid);
}

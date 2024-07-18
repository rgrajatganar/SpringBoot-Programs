package com.anudip.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.entity.Teacher;
import com.anudip.exception.TeacherIdNotFoundException;
import com.anudip.repository.TeacherRepository;
import com.anudip.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService 
{

	@Autowired
	TeacherRepository teacherRepo;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		
		return teacherRepo.save(teacher);
	}

	@Override
	public Teacher getTeacherDetail(int tid) {
		
		return teacherRepo.findById(tid).
				orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
	}

	@Override
	public Teacher updateTeacherDetail(Teacher teacher, int tid) {
		Teacher UpdateTeacher = teacherRepo.findById(tid).
				orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
				// set new value
				UpdateTeacher.setTphone(teacher.getTphone());
				UpdateTeacher.setDesignation(teacher.getDesignation());
				teacherRepo.save(UpdateTeacher);
		return UpdateTeacher;
	}

	@Override
	public void deleteTeacherDetail(int tid) 
	{
		Teacher delTeacher =teacherRepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
		teacherRepo.delete(delTeacher);
		//teacherRepo.delete(tid);
		
		/* or
		 * teacherRepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher id is not corrected"));
		teacherRepo.deleteById(tid);*/
	}

}

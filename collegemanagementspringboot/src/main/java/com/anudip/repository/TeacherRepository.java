package com.anudip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{
	
}

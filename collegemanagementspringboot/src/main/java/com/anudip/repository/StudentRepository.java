package com.anudip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}

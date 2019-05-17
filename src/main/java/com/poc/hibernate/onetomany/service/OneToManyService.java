package com.poc.hibernate.onetomany.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.hibernate.onetomany.model.Department;
import com.poc.hibernate.onetomany.model.Student;
import com.poc.hibernate.onetomany.repo.DepartmentRepo;

@Service
public class OneToManyService {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	public void testOneToMany() {
		Department department = new Department("IT","Information Technology");
		Student student1 = new Student("Pramod", "pramoddhone@yahoo.com");
		Student student2 = new Student("Rahul", "rahulmukharjee@yahoo.com");
		Set<Student> students = new HashSet<Student>(Arrays.asList(student1, student2));
		department.setStudents(students);
		departmentRepo.save(department);
		System.out.println("Success");
	}

}

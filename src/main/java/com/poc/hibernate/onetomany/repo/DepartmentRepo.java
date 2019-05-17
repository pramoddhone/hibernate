package com.poc.hibernate.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.hibernate.onetomany.model.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}

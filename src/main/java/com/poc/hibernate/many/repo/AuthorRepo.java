package com.poc.hibernate.many.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.hibernate.many.model.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer> {

}

package com.poc.hibernate.many.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.hibernate.many.model.Author;
import com.poc.hibernate.many.model.Book;
import com.poc.hibernate.many.repo.AuthorRepo;

@Service
public class ManyToManyService {
	
	@Autowired
	private AuthorRepo authorRepo;
	
	public void testManyToMany() {
		Author author = new Author("Pramod");
		Book book1 = new Book("Book 1");
		Book book2 = new Book("Book 2");
		Book book3 = new Book("Book 3");
		Set<Book> books = new HashSet<>(Arrays.asList(book1,book2,book3));
		author.setBooks(books);
		authorRepo.save(author);
	}
	
}

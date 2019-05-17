package com.poc.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.poc.hibernate.many.service.ManyToManyService;
import com.poc.hibernate.one.repo.service.OneToOneService;
import com.poc.hibernate.onetomany.service.OneToManyService;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HibernateApplication.class, args);
		OneToOneService oneToOneService =context.getBean(OneToOneService.class);
		oneToOneService.testOneToOne();
		System.out.println("#Success oneToOneService");
		
		OneToManyService oneToManyService =context.getBean(OneToManyService.class);
		oneToManyService.testOneToMany();
		System.out.println("#Success oneToManyService");
		
		ManyToManyService manyToManyService =context.getBean(ManyToManyService.class);
		manyToManyService.testManyToMany();
		System.out.println("#Success manyToManyService");
		
	}

}

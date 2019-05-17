package com.poc.hibernate.one.repo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.hibernate.one.model.Account;
import com.poc.hibernate.one.model.Employee;
import com.poc.hibernate.one.repo.EmployeeRepo;

@Service
public class OneToOneService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Transactional
	public void testOneToOne() {
		Employee employee = new Employee("Pramod","pramoddhone@yahoo.com");
		Account account = new Account("100", "HDFC");
		//employee.setAccount(account);
		employeeRepo.save(employee);
		employee.setAccount(account);
		employeeRepo.save(employee);
		
		/*
		//Join table
		@OneToOne(cascade = CascadeType.ALL)
		@JoinTable(name="EMPLOYEE_ACCCOUNT", joinColumns = @JoinColumn(name="EMPLOYEE_ID"),
		inverseJoinColumns = @JoinColumn(name="ACCOUNT_ID"))
		private AccountEntity account;
		
		//shared with primary Key
		@OneToOne(cascade = CascadeType.ALL)
		@PrimaryKeyJoinColumn
		private AccountEntity accoun
		
		@OneToOne(mappedBy="account", cascade=CascadeType.ALL)
		private EmployeeEntity employee;*/
	}

}

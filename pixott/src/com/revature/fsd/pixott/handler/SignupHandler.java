package com.revature.fsd.pixott.handler;

import com.revature.fsd.pixott.dao.CustomerDao;
import com.revature.fsd.pixott.model.Customer;

public class SignupHandler {
	public static void display() {
		System.out.println("enter name");
		String name=App.scanner.nextLine();
		System.out.println("enter mobile");
		String mobile=App.scanner.nextLine();
		System.out.println("enter password");
		String password=App.scanner.nextLine();
		
	    CustomerDao dao = new CustomerDao();
		Customer customer = new Customer();
		customer.setName(name);
		customer.setMobilenumber(mobile);
		customer.setPassword(password);
		dao.Signup(customer);
		
		MainmenuHandler.display();
	}

}
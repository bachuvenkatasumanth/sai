package com.revature.fsd.pixott.handler;

import com.revature.fsd.pixott.dao.CustomerDao;
import com.revature.fsd.pixott.model.Customer;

public class LogingHandler {
	
public static void display(){
	
{	
	System.out.println("Login");
	System.out.println("-----------");
    System.out.println("mobile number:");
	String mobile =App.scanner.nextLine();
	System.out.println("password:");
	String password= App.scanner.nextLine();
	CustomerDao dao = new CustomerDao();
	Customer user = new Customer();
	user = dao.getUser(mobile);
	MovieHandler.displaymovie();
}
}
}
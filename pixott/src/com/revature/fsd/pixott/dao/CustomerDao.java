package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.fsd.pixott.handler.MainmenuHandler;
import com.revature.fsd.pixott.model.Customer;

public class CustomerDao {
	public void Signup(Customer customer) {
		String sql = "insert into customer (name,mobilenumber,password) values (?,?,?)";

		try (
				Connection conn = Util.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql);
				)
		{
			System.out.println("connected successfully");
			stmt.setString(1, customer.getName());
			stmt.setString(2, customer.getMobilenumber());
			stmt.setString(3, customer.getPassword());
			stmt.execute();
			System.out.println("customer added successfully");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}
	
	public Customer getUser(String mobile) {
		String sql = "select * from customer where mobilenumber = ?";
		try (
				Connection conn = Util.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql);
				)
		{
			//System.out.println("connected successfully");
			stmt.setString(1, mobile);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt("id"));
				customer.setMobilenumber(rs.getString("mobilenumber"));
				customer.setName(rs.getString("name"));
				customer.setPassword(rs.getString("password"));
				System.out.println("Login Successfull");
				return customer;
			} else {
				System.out.println("invalid login details");
				MainmenuHandler.display();
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		return null;
	}
	
	
	
	
	
	
}
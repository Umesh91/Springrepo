package com.Spring5MVCCRUD.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer 
{
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;

	public Customer()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

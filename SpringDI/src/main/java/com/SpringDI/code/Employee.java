package com.SpringDI.code;

public class Employee {

	private int id;
	private String name;
	private Address address;//Aggregation
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void show()
	{
		System.out.println(id +" "+name);
		System.out.println(address.toString());
	}
	
}

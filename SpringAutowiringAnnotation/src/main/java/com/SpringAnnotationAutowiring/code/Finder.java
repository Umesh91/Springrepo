package com.SpringAnnotationAutowiring.code;

import org.springframework.beans.factory.annotation.Autowired;

public class Finder 
{
	private String name;
	private Constants constants;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Constants getConstants() {
		return constants;
	}
	@Autowired
	public void setConstants(Constants constants) {
		this.constants = constants;
	}
	
	public void getShape()
	{
		System.out.println("Shape is Cone");
		constants.getArea();
	}

}

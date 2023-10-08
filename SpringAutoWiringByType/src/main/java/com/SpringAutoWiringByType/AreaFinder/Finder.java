package com.SpringAutoWiringByType.AreaFinder;

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
	public void setConstants(Constants constants) {
		this.constants = constants;
	}
	
	public void getShape()
	{
		System.out.println("Shape is circle");
		constants.getArea();
	}

}

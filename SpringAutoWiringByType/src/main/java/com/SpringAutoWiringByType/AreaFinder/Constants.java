package com.SpringAutoWiringByType.AreaFinder;

import java.util.Scanner;

public class Constants
{

	public Constants() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double displayConstant()
	{
		double PI=3.1412;
		//System.out.println("value of PI="+PI);
		return PI;
	}
	
	public double getArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		int radius=sc.nextInt();
		System.out.println("Radius of Circle is "+radius);
		double area=displayConstant()*radius*radius;
		System.out.println("Area of Circle= \t"+area+"in square unit");
		return area;
	}

}

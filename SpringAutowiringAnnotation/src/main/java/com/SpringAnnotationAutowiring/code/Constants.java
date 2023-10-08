package com.SpringAnnotationAutowiring.code;

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
		System.out.println("Enter radius of Cone");
		int radius=sc.nextInt();
		System.out.println("Enter slant height of Cone");
		int height=sc.nextInt();
		System.out.println("Radius of Cone is "+radius);
		System.out.println("Height of Cone is "+height);
		double area=displayConstant()*radius*height;
		System.out.println("Surface Area of Cone= \t"+area+"in square unit");
		return area;
	}
}

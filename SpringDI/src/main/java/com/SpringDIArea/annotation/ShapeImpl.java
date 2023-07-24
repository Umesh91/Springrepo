package com.SpringDIArea.annotation;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component("service1")
public class ShapeImpl implements ShapeService
{

	public String getShapeName() 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shape name");
		String s1=sc.nextLine();
		return s1;
	}

}

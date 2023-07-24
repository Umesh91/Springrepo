/**
 * 
 */
package com.SpringDIArea.annotation;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author A631954
 *
 */
@Component("circle")
public class CircleImpl implements CricleIntf
{
	@Autowired
	private ShapeService service;

	public double area() 
	{
		// TODO Auto-generated method stub
		String shape=service.getShapeName();
		System.out.println("Name of Shape \t"+shape);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=sc.nextInt();
		System.out.println("Radius in "+r+"cm");
		double PI=3.1412;
		double area=PI*r*r;
		System.out.println("Area = \t"+area);
		return area;
	}
	

}

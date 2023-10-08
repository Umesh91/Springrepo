package com.SpringAutoWiringByName.code;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public final class Main
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Travel travel=(Travel) factory.getBean("travelBean");
		String carName=travel.getCar().getCarName();
		String carType=travel.getCar().getCarType();
		
		System.out.println("Travel name :"+travel.getName());
		System.out.println("Travel type :"+travel.getType());
		System.out.println("Car name"+carName);
		System.out.println("Car Type \t"+carType);
	}

}

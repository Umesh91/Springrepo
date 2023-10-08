package com.SpringAutoWiringByConstructor.code;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Travel travel=(Travel) factory.getBean("travelBean");
		System.out.println("Travel name"+travel.getName());
		System.out.println("Car name"+travel.getCar().getCarName());
	}

}

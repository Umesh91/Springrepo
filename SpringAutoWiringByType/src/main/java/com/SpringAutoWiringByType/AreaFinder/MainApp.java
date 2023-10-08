package com.SpringAutoWiringByType.AreaFinder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
		Finder find=(Finder) context.getBean("find");
		find.getShape();

	}

}

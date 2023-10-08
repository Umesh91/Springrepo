package com.SpringAutoWiringByType.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		City city=context.getBean("city",City.class);
		city.setId(100);
		city.setName("Vadodra");
	}

}

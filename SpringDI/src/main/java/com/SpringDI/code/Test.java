package com.SpringDI.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext appContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		 Employee s=(Employee)appContext.getBean("e");  
	     s.show();
	}

}

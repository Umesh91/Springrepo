package com.SpringIOCSetter.code;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		StringOps sts=context.getBean("stringops",StringOps.class);
		sts.Operation();
		
	}

}

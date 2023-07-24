package com.SpringDI.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDIAnnotation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.SpringDI.annotation");
		context.refresh();
		
		MyClient client=(MyClient) context.getBean("client1");
		client.doMessage();

	}

}

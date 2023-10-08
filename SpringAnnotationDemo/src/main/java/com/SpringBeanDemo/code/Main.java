package com.SpringBeanDemo.code;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BeanFactory factory=new ClassPathXmlApplicationContext("spring.xml");
		College college=(College) factory.getBean("college");
		Department department=college.getDepartment();
		System.out.println("College Name \t"+college.getCollegeName());
		System.out.println("Department id \t"+department.getDeptId());
		System.out.println("Department name \t"+department.getDepName());
	}

}

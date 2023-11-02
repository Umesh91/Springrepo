package com.SpringAOPDemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringAOPDemo.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService service=ctx.getBean("employeeService",EmployeeService.class);
		System.out.println(service.getEmployee().getName());
		service.getEmployee().setName("Ranjan");
		service.getEmployee().throwException();
		ctx.close();
	}

}

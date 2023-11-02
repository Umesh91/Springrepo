package com.SpringAOPAspectJ.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringAOPAspectJ.dto.EmployeeDTO;
import com.SpringAOPAspectJ.intf.EmployeeManager;

public class TestAOP 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeManager manager=(EmployeeManager) context.getBean("employeeManager");
		manager.getEmployeeById(1);
		manager.createEmployee(new EmployeeDTO());
		manager.deleteEmployee(100);
	}

}

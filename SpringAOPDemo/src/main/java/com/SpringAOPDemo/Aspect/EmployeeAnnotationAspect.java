package com.SpringAOPDemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect
{
	@Before("@annotation(com.SpringAOPDemo.Aspect.Loggable)")
	public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}

}

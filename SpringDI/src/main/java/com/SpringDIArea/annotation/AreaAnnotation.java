/**
 * 
 */
package com.SpringDIArea.annotation;

import java.io.Console;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * @author A631954
 *
 */
public class AreaAnnotation {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.SpringDIArea.annotation");
		context.refresh();
		
		CircleImpl impl=(CircleImpl) context.getBean("circle");
		impl.area();
	}

}

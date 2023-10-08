package com.SpringAutoWiringByType.spellcheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TextEditor editor= (TextEditor) context.getBean("sayali");
		editor.checkIt();
	}

}

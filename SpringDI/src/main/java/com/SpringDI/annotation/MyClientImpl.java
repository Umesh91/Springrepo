package com.SpringDI.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("client1")
public class MyClientImpl implements MyClient
{
	@Autowired
	private MyService myService;
	public void doMessage() {
		// TODO Auto-generated method stub
		String info=myService.getInfo();
		System.out.println(info);
		
	}

}

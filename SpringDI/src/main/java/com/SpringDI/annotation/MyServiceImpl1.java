package com.SpringDI.annotation;

import org.springframework.stereotype.Component;

@Component("service1")
public class MyServiceImpl1 implements MyService{

	public String getInfo() {
		// TODO Auto-generated method stub
		return "Service 1 info";
	}

}

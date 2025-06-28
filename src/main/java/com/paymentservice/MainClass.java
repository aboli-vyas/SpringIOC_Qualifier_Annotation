package com.paymentservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		User u = context.getBean(User.class);
		System.out.println(u.getService1().payment());
		System.out.println(u.getService2().payment());
		
	}

}

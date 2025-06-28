package com.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	@Autowired
	@Qualifier("cc")
	PaymentService service1;
	
	@Autowired
	@Qualifier("upi")
	PaymentService service2;

	public User() {
		
	}

	public User(PaymentService service1, PaymentService service2) {
		super();
		this.service1 = service1;
		this.service2 = service2;
	}

	public PaymentService getService1() {
		return service1;
	}

	public void setService1(PaymentService service1) {
		this.service1 = service1;
	}

	public PaymentService getService2() {
		return service2;
	}

	public void setService2(PaymentService service2) {
		this.service2 = service2;
	}

	@Override
	public String toString() {
		return "User [service1=" + service1 + ", service2=" + service2 + "]";
	}
	
	
	

}

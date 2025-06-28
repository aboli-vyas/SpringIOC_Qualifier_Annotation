package com.paymentservice;

import org.springframework.stereotype.Component;

@Component("cc")
public class CreditCard implements PaymentService{

	@Override
	public String payment() {
		return "Payment done using Credit Card";
	}

}

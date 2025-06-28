package com.paymentservice;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPI implements PaymentService {

	@Override
	public String payment() {
		return "Payment done using UPI";
	}
	

}

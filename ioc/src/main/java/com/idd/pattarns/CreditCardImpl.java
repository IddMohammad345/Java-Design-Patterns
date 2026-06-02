package com.idd.pattarns;

import org.springframework.stereotype.Component;

@Component
public class CreditCardImpl implements CreditCard {

	@Override
	public void makePayment() {
		System.out.println("Payment Mode");
	}

}

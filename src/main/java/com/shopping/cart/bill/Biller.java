package com.shopping.cart.bill;

import java.text.ParseException;

public interface Biller {

	/**
	 * 
	 * This method calculate the customer's shopping cart bill after considering
	 * applicable discount rates that are based on the purchase amount and
	 * customer type
	 * 
	 * @param purchaseAmount
	 *            ex $4,000
	 * @param customerType
	 *            ex Regular,Premium
	 * @return
	 * @throws ParseException
	 */
	String calculateCustomerBill(String purchaseAmount, String customerType) throws ParseException;

}
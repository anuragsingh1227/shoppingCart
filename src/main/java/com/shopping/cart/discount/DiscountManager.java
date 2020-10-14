package com.shopping.cart.discount;

public interface DiscountManager {

	/**
	 * This method calculate discount on an amount based on slabs for customer
	 *
	 * @param purchaseAmount
	 *            ex 4000
	 * @param customerType
	 *            ex Regular
	 * @return
	 */
	int calculateDiscount(int purchaseAmount, String customerType);

}
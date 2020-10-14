package com.shopping.cart.bill;

import java.text.ParseException;

import com.shopping.cart.discount.DiscountManager;
import com.shopping.cart.utility.AppUtility;

public class BillerImpl implements Biller {

	private DiscountManager discountManager;

	public BillerImpl(DiscountManager discountManager) {

		this.discountManager = discountManager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shopping.cart.bill.Biller#calculateBill(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String calculateCustomerBill(String purchaseAmount, String customerType) throws ParseException {
		int amount = AppUtility.getAmountfromCurrencyString(purchaseAmount);
		int discount = discountManager.calculateDiscount(amount, customerType);
		return AppUtility.formatAmount(amount - discount);

	}

}

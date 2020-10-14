package com.shopping.cart.utility;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;

import com.shopping.cart.customer.CustomerTypes;
import com.shopping.cart.slabs.Slab;
import com.shopping.cart.slabs.Slabs;

public class AppUtility {

	private AppUtility() {

	}

	/**
	 * Return discount slabs based on customer type
	 * 
	 * @param customerType
	 * @return
	 */
	public static Map<Slabs, Slab> getDiscountSlabsForCustomer(String customerType) {
		Map<Slabs, Slab> discountSlabs = new EnumMap<>(Slabs.class);
		for (CustomerTypes type : CustomerTypes.values()) {
			if (type.getName().equals(customerType)) {
				return type.getCustomerDiscountSlabs();
			}

		}
		return discountSlabs;

	}

	/**
	 * This method get int value from input string with currency
	 * 
	 * @param amountWithCurrency
	 * @return
	 * @throws ParseException
	 */
	public static int getAmountfromCurrencyString(String amountWithCurrency) throws ParseException {

		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		Number number = format.parse(amountWithCurrency);
		return number.intValue();

	}

	/**
	 * this method change int to desired output string
	 * 
	 * @param amount
	 * @return
	 */
	public static String formatAmount(int amount) {
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		n.setMinimumFractionDigits(0);
		return n.format(amount);
	}

}

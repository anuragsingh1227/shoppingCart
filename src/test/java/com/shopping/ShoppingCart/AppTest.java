package com.shopping.ShoppingCart;

import java.text.ParseException;

import com.shopping.cart.bill.Biller;
import com.shopping.cart.bill.BillerImpl;
import com.shopping.cart.discount.DiscountManager;
import com.shopping.cart.discount.DiscountManagerImpl;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test cases for App.
 */
public class AppTest extends TestCase {

	DiscountManager discountManager = new DiscountManagerImpl();
	Biller biller = new BillerImpl(discountManager);

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 * 
	 * @throws ParseException
	 */
	public void testRegularCustomer() throws ParseException {
		assertEquals("$5,000", biller.calculateCustomerBill("$5,000", "Regular"));
		assertEquals("$9,500", biller.calculateCustomerBill("$10,000", "Regular"));
		assertEquals("$13,500", biller.calculateCustomerBill("$15,000", "Regular"));

	}

	/**
	 * Rigourous Test :-)
	 * 
	 * @throws ParseException
	 */
	public void testPremiumCustomer() throws ParseException {
		assertEquals("$3,600", biller.calculateCustomerBill("$4,000", "Premium"));
		assertEquals("$7,000", biller.calculateCustomerBill("$8,000", "Premium"));
		assertEquals("$10,200", biller.calculateCustomerBill("$12,000", "Premium"));
		assertEquals("$15,800", biller.calculateCustomerBill("$20,000", "Premium"));

	}

}

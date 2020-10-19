package com.shopping.cart.discount;

import java.util.Map;

import com.shopping.cart.slabs.Slab;
import com.shopping.cart.slabs.Slabs;
import com.shopping.cart.utility.AppUtility;

public class DiscountManagerImpl implements DiscountManager {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shopping.cart.discount.DiscountManager#calculateDiscount(int,
	 * java.lang.String)
	 */
	@Override
	public int calculateDiscount(int purchaseAmount, String customerType) {

		Map<Slabs, Slab> discountSlabs = AppUtility.getDiscountSlabsForCustomer(customerType);

		return discountSlabs.isEmpty() ? 0
				: discountSlabs.entrySet().stream().mapToInt(p -> (slabDiscount(purchaseAmount, p.getValue()))).sum();

	}

	/**
	 * This is a utility method and used to calculate discount on an amount
	 * based on input Slab
	 * 
	 * @param amount
	 * @param slab
	 * @return
	 */
	private int slabDiscount(int amount, Slab slab) {
		int discount = 0;

		if (amount > slab.getMin()) {

			discount = amount > slab.getMax() ? ((slab.getMax() - slab.getMin()) * slab.getDiscountPercentage() / 100)
					: ((amount - slab.getMin()) * slab.getDiscountPercentage() / 100);
		}

		return discount;
	}

}

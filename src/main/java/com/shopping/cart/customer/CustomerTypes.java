package com.shopping.cart.customer;

import java.util.EnumMap;
import java.util.Map;

import com.shopping.cart.slabs.Slab;
import com.shopping.cart.slabs.Slabs;

public enum CustomerTypes {

	REGULAR {
		@Override
		public Map<Slabs, Slab> getCustomerDiscountSlabs() {
			Map<Slabs, Slab> discountSlabs = new EnumMap<>(Slabs.class);
			discountSlabs.put(Slabs.SLAB1, new Slab(0, 5000, 0));
			discountSlabs.put(Slabs.SLAB2, new Slab(5000, 10000, 10));
			discountSlabs.put(Slabs.SLAB3, new Slab(10000, Integer.MAX_VALUE, 20));
			return discountSlabs;
		}

		@Override
		public String getName() {
			return "Regular";
		}

	},
	PREMIUM

	{
		@Override
		public Map<Slabs, Slab> getCustomerDiscountSlabs() {
			Map<Slabs, Slab> discountSlabs = new EnumMap<>(Slabs.class);
			discountSlabs.put(Slabs.SLAB1, new Slab(0, 4000, 10));
			discountSlabs.put(Slabs.SLAB2, new Slab(4000, 8000, 15));
			discountSlabs.put(Slabs.SLAB3, new Slab(8000, 12000, 20));
			discountSlabs.put(Slabs.SLAB4, new Slab(12000, Integer.MAX_VALUE, 30));
			return discountSlabs;
		}

		@Override
		public String getName() {
			return "Premium";
		}
	};

	public abstract Map<Slabs, Slab> getCustomerDiscountSlabs();

	public abstract String getName();

}
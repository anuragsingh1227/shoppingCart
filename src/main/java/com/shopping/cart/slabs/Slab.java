package com.shopping.cart.slabs;

public class Slab {

	public Slab(int amountStart, int amountEnd, int discount) {
		super();
		this.amountStart = amountStart;
		this.amountEnd = amountEnd;
		this.discount = discount;
	}

	private int amountStart;
	private int amountEnd;
	private int discount;

	public int getMin() {
		return amountStart;
	}

	public void setMin(int min) {
		this.amountStart = min;
	}

	public int getMax() {
		return amountEnd;
	}

	public void setMax(int max) {
		this.amountEnd = max;
	}

	public int getDiscountPercentage() {
		return discount;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discount = discountPercentage;
	}

}

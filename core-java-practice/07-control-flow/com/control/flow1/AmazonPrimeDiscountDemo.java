package com.control.flow1;

/**
 * Entry point for AmazonPrimeDiscount.
 * Runs it for a Prime member with an order of 5000.
 *
 * Output:
 *   you are a prime member
 *   you will get 1000.0discount
 *   total order amount is 4000.0
 */
public class AmazonPrimeDiscountDemo {

	public static void main(String[] args) {

		AmazonPrimeDiscount a = new AmazonPrimeDiscount();
		a.calculateDiscount("Abhay", 5000, true);
	}

}

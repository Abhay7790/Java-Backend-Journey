package com.control.flow1;

/**
 * Calculates a discount from the order amount and Prime membership.
 * Concept: nested if-else. An if / else if chain checks the order amount,
 * and inside each branch another if checks whether the customer is a Prime member.
 *
 * Rules:
 * - Up to 2000     : no discount
 * - Below 5000     : 10% for non-prime, 15% for prime
 * - 5000 and above : 15% for non-prime, 20% for prime, discount capped at 1500
 *
 * Run AmazonPrimeDiscountDemo to see it work.
 */
public class AmazonPrimeDiscount {

	public String calculateDiscount(String customerName, int orderAmount, boolean prime) {

		String discount = null;
		double discount1 = 0;
		double totalAmount = 0;
		{
			if (orderAmount <= 2000) {

				discount = "no discount";
				System.out.println(discount);

			}

			else if (orderAmount > 2001 && orderAmount < 5000) {

				if (prime == false) {
					discount1 = orderAmount * 0.10;
					totalAmount = orderAmount - discount1;
					System.out.println("you are not a prime member");
					discount=("you will get " + discount1 + "discount");
					System.out.println("total order amount is " + totalAmount);

				}

				if (prime == true) {
					discount1 = orderAmount * 0.15;
					totalAmount = orderAmount - discount1;
					System.out.println("you are a prime member");
					discount=("you will get " + discount1 + "discount");
					System.out.println("total order amount is " + totalAmount);

				}}

				else if (orderAmount >= 5000) {
					if (prime == false) {
						discount1 = orderAmount * 0.15;
						// nested if: the discount can never be more than 1500
						if (discount1 > 1500) {
							discount1 = 1500;

						}
						totalAmount = orderAmount - discount1;
						System.out.println("you are not a prime member");
						System.out.println("you will get " + discount1 + "discount");
						System.out.println("total order amount is " + totalAmount);

					}

					if (prime == true) {
						discount1 = orderAmount * 0.20;
						if (discount1 > 1500) {
							discount1 = 1500;

						}
						totalAmount = orderAmount - discount1;
						System.out.println("you are a prime member");
						System.out.println("you will get " + discount1 + "discount");
						System.out.println("total order amount is " + totalAmount);

					}

				}

				
			}
		
		return discount;	}
}

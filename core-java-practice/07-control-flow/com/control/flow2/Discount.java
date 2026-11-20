package com.control.flow2;

/**
 * Calculates a discount by customer type, taking the values from the command line.
 * Concept: switch statement on a String (case gold / silver / regular),
 * with break to stop each case, and an early return for small purchases.
 *
 * Rules:
 * - Purchase of 1000 or less: no discount
 * - gold 20%, silver 15%, regular 10%
 *
 * Run from the 07-control-flow folder:
 *   javac com/control/flow2/Discount.java
 *   java com.control.flow2.Discount gold 5000
 *
 * Output:
 *   Discount of amount 1000.0
 *   total price 4000.0
 */
public class Discount {
	public static void main(String[] args) {

		Discount discount = new Discount();

		String customerType = args[0];
		int purchaseValue = Integer.parseInt(args[1]);
		discount.calculateDiscount(customerType, purchaseValue);

	}

	public void calculateDiscount(String customerType, int purchaseValue) {

		if (purchaseValue <= 1000) {

			System.out.println("Discount is only applicable on purchase value above 1000");
			return;
		}

		double discount1 = 0;
		double totalAmount = 0;

		switch (customerType) {
		case "gold":

			discount1 = purchaseValue * 0.20;
			totalAmount = purchaseValue - discount1;

			// note: without braces, this if controls only the next println line
			if (discount1 < 2500)

				System.out.println("Discount of amount " + discount1);

			System.out.println("total price " + totalAmount);

			break;

		case "silver":

			discount1 = purchaseValue * 0.15;
			totalAmount = purchaseValue - discount1;

			if (discount1 < 2500)

				System.out.println("Discount of 15 percent is" + discount1);

			System.out.println("total price " + totalAmount);

			break;
		case "regular":

			discount1 = purchaseValue * 0.10;
			totalAmount = purchaseValue - discount1;

			if (discount1 < 2500)

				System.out.println("Discount of 10 percent is" + discount1);

			System.out.println("total price " + totalAmount);

			break;

		}
	}
}

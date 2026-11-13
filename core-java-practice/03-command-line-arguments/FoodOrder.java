/**
 * Takes four order details from the command line and prints them.
 * Concept: command-line arguments with a more realistic example
 * (order id, food item, customer name, delivery location).
 *
 * How to run:
 *   javac FoodOrder.java
 *   java FoodOrder 101 Pizza Ravi Bangalore
 *
 * Running it with fewer than 4 arguments throws ArrayIndexOutOfBoundsException.
 */
public class FoodOrder {

    public static void main(String[] args) {
        String orderId = args[0];
        String foodItem = args[1];
        String customerName = args[2];
        String deliveryLocation = args[3];

        System.out.println("order id " + orderId);
        System.out.println("food item " + foodItem);
        System.out.println("customer name " + customerName);
        System.out.println("delivery location " + deliveryLocation);
    }
}
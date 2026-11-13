/**
 * Checks admission eligibility from values given on the command line.
 * Concept: parsing different data types (int, double, boolean) from String
 * arguments, and combining conditions with the && (AND) operator.
 *
 * A student is eligible only if age >= 18, percentage >= 65 and qualified is true.
 *
 * How to run:
 *   javac Admission.java
 *   java Admission Ravi 19 72.5 true
 *
 * Running it without 4 arguments throws ArrayIndexOutOfBoundsException.
 */
public class Admission {

    public static void main(String[] args) {
        String studentName = args[0];
        int age = Integer.parseInt(args[1]);
        double percentage = Double.parseDouble(args[2]);
        boolean qualified = Boolean.parseBoolean(args[3]);

        boolean eligible = age >= 18 && percentage >= 65 && qualified == true;

        System.out.println("Student name " + studentName);
        System.out.println("Age " + age);
        System.out.println("percentage " + percentage);
        System.out.println("qualified " + qualified);

        System.out.println("eligible " + eligible);
    }
}
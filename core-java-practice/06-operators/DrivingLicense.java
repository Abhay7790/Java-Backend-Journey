/**
 * Checks driving license eligibility from values given on the command line.
 * Concept: the ternary operator (condition ? valueIfTrue : valueIfFalse),
 * a short form of if-else, combined with the && (AND) operator.
 *
 * A person is eligible only if age >= 18 and they have an ID proof.
 *
 * How to run:
 *   javac DrivingLicense.java
 *   java DrivingLicense Ravi 20 true
 *
 * Running it without 3 arguments throws ArrayIndexOutOfBoundsException.
 */
public class DrivingLicense {

    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        boolean hasIdProof = Boolean.parseBoolean(args[2]);

        boolean eligible = age >= 18 && hasIdProof;

        String result = eligible ? "eligible" : "not eligible";

        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("hasIdProof " + hasIdProof);
        System.out.println("status " + result);
    }
}
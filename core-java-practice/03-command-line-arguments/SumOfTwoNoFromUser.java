class SumOfTwoNoFromUser
{ 
    /**
 * Takes two numbers from the command line and prints their sum.
 * Concept: command-line arguments always arrive as Strings, so
 * Integer.parseInt() converts them to int before adding.
 *
 * How to run:
 *   javac SumOfTwoNoFromUser.java
 *   java SumOfTwoNoFromUser 10 20
 *
 * Running it without 2 arguments throws ArrayIndexOutOfBoundsException.
 * Passing text like "abc" throws NumberFormatException.
 */
 public static void main(String[]a)
 {
  int b = Integer.parseInt(a[0]);
  int c = Integer.parseInt(a[1]);
  System.out.println(b+c);
 }
}
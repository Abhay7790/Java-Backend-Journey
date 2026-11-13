/**
 * Shows the main types of operators in Java.
 * Concept: operators work on values (operands) and produce a result.
 *
 * Types covered:
 * - Arithmetic:  +  -  *  /  %
 * - Relational:  >  <  >=  <=  ==  !=   (result is true or false)
 * - Logical:     &&  ||  !              (combine or reverse boolean values)
 * - Increment:   ++  --                 (add or subtract 1)
 * - Ternary:     condition ? valueIfTrue : valueIfFalse
 */
public class Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic (int / int drops the decimal part, % gives the remainder)
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational
        System.out.println("a > b : " + (a > b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical
        System.out.println("a > 5 && b > 5 : " + (a > 5 && b > 5));
        System.out.println("a > 5 || b > 5 : " + (a > 5 || b > 5));
        System.out.println("!(a > 5) : " + !(a > 5));

        // Increment: x++ uses the value first, ++x adds 1 first
        int x = 5;
        System.out.println("x++ gives " + (x++));
        System.out.println("++x gives " + (++x));

        // Ternary
        int bigger = (a > b) ? a : b;
        System.out.println("bigger number : " + bigger);
    }
}
/**
 * A simple calculator built with a class, instance variables and methods.
 * Concept:
 * - Instance variables (a, b) hold the data of each Calculator object.
 * - Instance methods (add, subtract, multiply) use that data, so they are
 *   called through an object: calc.add().
 * - welcome() is static, so it is called through the class name: Calculator.welcome().
 */
public class Calculator {

    int a;
    int b;

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Calculator.welcome();

        calc.a = 10;
        calc.b = 40;

        calc.add();
        calc.subtract();
        calc.multiply();
    }

    void add() {
        System.out.println("Addition : " + (a + b));
    }

    void subtract() {
        System.out.println("Subtraction : " + (a - b));
    }

    void multiply() {
        System.out.println("Multiplication : " + (a * b));
    }

    static void welcome() {
        System.out.println("welcome to calculator");
    }
}
/**
 * Shows local variable scope.
 * Concept: a variable declared inside a method exists only in that method.
 * Other methods cannot see it, so each method needs its own variable
 * (or the variable must be a field of the class).
 */
public class LocalVariableScope {

    public static void main(String[] args) {
        int balance = 100;
        int amountToBeTax = 10;
        System.out.println("balance is : " + balance);

        // Both variables above are local to main, so doSomething() cannot use them.
        LocalVariableScope scope = new LocalVariableScope();
        scope.doSomething();
    }

    void doSomething() {
        // Using amountToBeTax here would give "cannot find symbol",
        // because it was declared in main. This method needs its own variable.
        int amountToBeTax = 20;
        System.out.println("tax amount is : " + amountToBeTax);
    }
}
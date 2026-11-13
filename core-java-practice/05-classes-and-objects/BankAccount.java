/**
 * Shows instance and static members of a class: variables and methods.
 * Concept:
 * - Instance members (balance, showBalance) belong to an object,
 *   so they are used through an object: acc.balance, acc.showBalance().
 * - Static members (name, bankDetails) belong to the class,
 *   so they are used through the class name: BankAccount.name, BankAccount.bankDetails().
 */
public class BankAccount {

    int balance = 100000;           // instance variable
    static String name = "SBI";     // static variable

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        System.out.println("bank name " + BankAccount.name);
        System.out.println("balance " + acc.balance);

        BankAccount.bankDetails();
        acc.showBalance();
    }

    // static method: called with the class name, no object needed
    static void bankDetails() {
        System.out.println("static method call");
    }

    // instance method: needs an object to be called
    void showBalance() {
        System.out.println("instance method call");
    }
}
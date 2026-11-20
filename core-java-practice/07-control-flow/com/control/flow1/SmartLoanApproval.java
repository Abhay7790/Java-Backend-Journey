
package com.control.flow1;

/**
 * Decides loan approval from age, salary, credit score and existing loan.
 * Concept: combining conditions with || (OR) and && (AND) inside an
 * if / else if / else chain, and storing the result in a boolean variable.
 *
 * Rules:
 * - Rejected if age is below 21 or above 60, or salary is below 30000
 * - With an existing loan: salary >= 60000 and credit score >= 780
 * - Without an existing loan: salary below 50000 needs credit score >= 750,
 *   salary of 50000 or more needs credit score >= 700
 *
 * Run from the 07-control-flow folder:
 *   javac com/control/flow1/SmartLoanApproval.java
 *   java com.control.flow1.SmartLoanApproval
 *
 * Output: Loan Approved
 */
public class SmartLoanApproval {

    public static void main(String[] args) {

        int age = 25;
        double salary = 40000;
        int creditScore = 760;
        boolean hasExistingLoan = false;

        boolean eligible;

        if (age < 21 || age > 60 || salary < 30000) {
            eligible = false;
        } else if (hasExistingLoan) {
            eligible = salary >= 60000 && creditScore >= 780;
        } else {
            eligible =
                (salary < 50000 && creditScore >= 750)
                || (salary >= 50000 && creditScore >= 700);
        }

        if (eligible) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Rejected");
        }
    }
}

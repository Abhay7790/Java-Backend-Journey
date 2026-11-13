/**
 * Calculates an employee's final salary from command-line values.
 * Concept: adding an int (basic salary) and a double (bonus) gives a double.
 *
 * How to run:
 *   javac Employee.java
 *   java Employee Ravi E101 30000 2500.5
 *
 * Running it without 4 arguments throws ArrayIndexOutOfBoundsException.
 */
public class Employee {

    public static void main(String[] args) {
        String employeeName = args[0];
        String employeeId = args[1];
        int basicSalary = Integer.parseInt(args[2]);
        double bonus = Double.parseDouble(args[3]);
        double finalSalary = basicSalary + bonus;

        System.out.println("employee name " + employeeName);
        System.out.println("employee id " + employeeId);
        System.out.println("basic salary " + basicSalary);
        System.out.println("bonus " + bonus);
        System.out.println("final salary " + finalSalary);
    }
}
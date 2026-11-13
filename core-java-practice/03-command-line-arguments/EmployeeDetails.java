class EmployeeDetails
{
    /**
 * Reads three names from the command line and prints them.
 * Concept: command-line arguments. Values typed after the class name
 * are stored in the args array of main.
 *
 * How to run:
 *   javac EmployeeDetails.java
 *   java EmployeeDetails Ravi Sita Amit
 *
 * In Eclipse: Run > Run Configurations > Arguments tab, then type the names there.
 * Running it without 3 arguments throws ArrayIndexOutOfBoundsException.
 */
 public static void main(String[]args)
 {
  String emp1 = args[0];
  String emp2 = args[1];
  String emp3 = args[2];
  
  System.out.println(emp1);
  System.out.println(emp2);
  System.out.println(emp3);
  
 }


}
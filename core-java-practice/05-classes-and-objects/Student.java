/**
 * Creates two Student objects to show how instance and static variables differ.
 * Concept:
 * - name and age are instance variables: each object keeps its own values.
 * - college is static: there is only one copy, shared by every Student object,
 *   so it is set through the class name (Student.college).
 */
public class Student {

    String name;
    int age;
    static String college;

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Ravi";
        student1.age = 20;

        student2.name = "Sita";
        student2.age = 22;

        Student.college = "ABC College";

        student1.showStudent();
        student2.showStudent();
        Student.showCollege();
    }

    void showStudent() {
        System.out.println("Student name " + name);
        System.out.println("Student age " + age);
    }

    static void showCollege() {
        System.out.println("college name " + college);
    }
}
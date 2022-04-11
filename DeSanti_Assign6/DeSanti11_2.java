/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 11.2

*/
import java.util.*;

public class DeSanti11_2 {
    public static void main(String[] args){
        String name = "";
        String address = "";
        String phone = "";
        String email = "";
        int choice = 0;
        int office = 0;
        double salary = 0;
        String title = "";
        String officeHours = "";
        String rank = "";

        Scanner in = new Scanner(System.in);
        System.out.println("We will test each class. Person, Student, Employee, Faculty, Staff.");
        System.out.println("Test the creation of a person.");
        System.out.println("Enter the Name as a valid string: ");
        name = in.nextLine();
        System.out.println("Enter the Address as a valid string: ");
        address = in.nextLine();
        System.out.println("Enter the Phone number as a valid string: ");
        phone = in.nextLine();
        System.out.println("Enter the Email as a valid string: ");
        email = in.nextLine();
        Person person = new Person(name, address, phone, email);
        System.out.println("=========================");
        System.out.println(person.toString());
        System.out.println("=========================");


        System.out.println("Test the creation of a student.");
        System.out.println("Enter the Name as a valid string: ");
        name = in.nextLine();
        System.out.println("Enter the Address as a valid string: ");
        address = in.nextLine();
        System.out.println("Enter the Phone number as a valid string: ");
        phone = in.nextLine();
        System.out.println("Enter the Email as a valid string: ");
        email = in.nextLine();
        System.out.println("Enter the Grade as a valid int (0=freshman, 1=sophmore, 2=junior, 3=senior): ");
        choice = in.nextInt();
        in.nextLine();
        Student student = new Student(name, address, phone, email, choice);
        System.out.println("=========================");
        System.out.println(student.toString());
        System.out.println("=========================");


        System.out.println("Test the creation of an employee.");
        System.out.println("Enter the Name as a valid string: ");
        name = in.nextLine();
        System.out.println("Enter the Address as a valid string: ");
        address = in.nextLine();
        System.out.println("Enter the Phone number as a valid string: ");
        phone = in.nextLine();
        System.out.println("Enter the Email as a valid string: ");
        email = in.nextLine();
        System.out.println("Enter the Office as a valid int: ");
        office = in.nextInt();
        System.out.println("Enter the Salary as a valid double: ");
        salary = in.nextDouble();
        in.nextLine();
        Employee employee = new Employee(name, address, phone, email, office, salary);
        System.out.println("=========================");
        System.out.println(employee.toString());
        System.out.println("=========================");

        
        System.out.println("Test the creation of a faculty.");
        System.out.println("Enter the Name as a valid string: ");
        name = in.nextLine();
        System.out.println("Enter the Address as a valid string: ");
        address = in.nextLine();
        System.out.println("Enter the Phone number as a valid string: ");
        phone = in.nextLine();
        System.out.println("Enter the Email as a valid string: ");
        email = in.nextLine();
        System.out.println("Enter the Office as a valid int: ");
        office = in.nextInt();
        System.out.println("Enter the Salary as a valid double: ");
        salary = in.nextDouble();
        in.nextLine();
        System.out.println("Enter the Office Hours as a valid string: ");
        officeHours = in.nextLine();
        System.out.println("Enter the rank as a valid string: ");
        rank = in.nextLine();
        Faculty faculty = new Faculty(name, address, phone, email, office, salary, officeHours, rank);
        System.out.println("=========================");
        System.out.println(faculty.toString());
        System.out.println("=========================");

        System.out.println("Test the creation of a staff.");
        System.out.println("Enter the Name as a valid string: ");
        name = in.nextLine();
        System.out.println("Enter the Address as a valid string: ");
        address = in.nextLine();
        System.out.println("Enter the Phone number as a valid string: ");
        phone = in.nextLine();
        System.out.println("Enter the Email as a valid string: ");
        email = in.nextLine();
        System.out.println("Enter the Office as a valid int: ");
        office = in.nextInt();
        System.out.println("Enter the Salary as a valid double: ");
        salary = in.nextDouble();
        in.nextLine();
        System.out.println("Enter the title as a valid string: ");
        title = in.nextLine();
        Staff staff = new Staff(name, address, phone, email, office, salary, title);
        System.out.println("=========================");
        System.out.println(staff.toString());
        System.out.println("=========================");

        in.close();
    }
}

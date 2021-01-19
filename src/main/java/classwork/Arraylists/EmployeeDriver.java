package classwork.Arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDriver {
    public static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        EmployeeFunctions ef = new EmployeeFunctions();

        employeeList.add(new Employee(101, "John Doe", "1st St., 123"));
        employeeList.add(new Employee(102, "Jane Doe", "2nd St., 456"));
        employeeList.add(new Employee(103, "James Doe", "3rd St., 789"));

        System.out.println("Employee Management--------------------------------");
        ef.displayAllEmployee(employeeList);

        while (!choice.equals("Q"))
        {
            displayMenu();
            choice = (getChoice(sc)).toUpperCase();

            switch (choice)
            {
                case "A":
                    ef.addEmployee(sc, employeeList);
                    break;
                case "E":
                    ef.editEmployee(sc, employeeList);
                    break;
                case "D":
                    ef.deleteEmployee(sc, employeeList);
                    break;
                default:
                    break;
            }
        }

        System.out.println("\nEnding operations--------------------------------");
        ef.displayAllEmployee(employeeList);
    }

    public static void displayMenu()
    {
        System.out.println("Please choose an option: ");
        System.out.println("A: Add an employee");
        System.out.println("E: Edit employee information");
        System.out.println("D: Delete an employee");
        System.out.println("Q: Quit");
    }

    public static String getChoice(Scanner sc)
    {
        String c = "";
        boolean isValid = false;

        while (!isValid)
        {
            System.out.print("Enter your choice: ");
            c = sc.nextLine();
            if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") ||
                    c.equalsIgnoreCase("d") || c.equalsIgnoreCase("q"))
                isValid = true;
            else
                System.out.println("Please enter one of the options!");
        }
        return c;
    }
}

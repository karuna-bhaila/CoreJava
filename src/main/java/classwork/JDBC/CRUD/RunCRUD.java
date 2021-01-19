package classwork.JDBC.CRUD;

import java.sql.SQLException;
import java.util.Scanner;

public class RunCRUD {
    static EmployeeFunctions emp_func;

    static {
        try {
            emp_func = new EmployeeFunctions();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        String choice = "";

        System.out.println("Employee Management--------------------------------");
        emp_func.displayAllEmployee();

        while (!choice.equals("Q"))
        {
            displayMenu();
            choice = (getChoice(sc)).toUpperCase();

            switch (choice)
            {
                case "A":
                    emp_func.addEmployee(sc);
                    break;
                case "E":
                    emp_func.editEmployee(sc);
                    break;
                case "D":
                    emp_func.deleteEmployee(sc);
                    break;
                default:
                    break;
            }
        }

        System.out.println("\nEnding operations--------------------------------");
        emp_func.displayAllEmployee();
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

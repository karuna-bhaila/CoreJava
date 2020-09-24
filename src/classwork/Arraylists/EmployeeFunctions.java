package classwork.Arraylists;

import java.util.List;
import java.util.Scanner;

public class EmployeeFunctions implements EmployeeInterface{

    @Override
    public void displayAllEmployee(List<Employee> e)
    {
        System.out.println("\nEmployee List:");

        if (e.size() > 0) {
            System.out.println("ID\t\tName\t\tAddress");
            for (int i = 0; i < e.size(); i++) {
                System.out.println(e.get(i).toString());
            }
        }
        else
        {
            System.out.println("No employees in the list.");
        }
        System.out.println();
    }

    @Override
    public void addEmployee(Scanner sc, List<Employee> e)
    {
        int id;
        String n,
                a;
        boolean duplicate = false;

        id = Validator.getInt(sc, "Enter employee ID: ");
        sc.nextLine();
        System.out.print("Enter name: ");
        n = sc.nextLine();
        System.out.print("Enter address: ");
        a = sc.nextLine();

        for (int i = 0; i < e.size(); i++)
        {
            if (id == e.get(i).getId())
                duplicate = true;
        }

        if (duplicate)
        {
            System.out.println("Error! Employee already exists in record.");
        }
        else
        {
            e.add(new Employee(id, n, a));
        }

        displayAllEmployee(e);
    }

    @Override
    public void editEmployee(Scanner sc, List<Employee> e)
    {
        int id,
                i = 0;
        String n = "",
                a = "";
        boolean found = false;

        id = Validator.getInt(sc, "Enter ID for the record to be edited: ");
        sc.nextLine();

        if(e.size() > 0) {
            while ((i < e.size()) && (!found)) {
                if (id == e.get(i).getId()) {
                    System.out.print("Enter name: ");
                    n = sc.nextLine();
                    System.out.print("Enter address: ");
                    a = sc.nextLine();
                    found = true;
                }
                else {
                    i++;
                }
            }

            if (found) {
                e.get(i).setName(n);
                e.get(i).setAddress(a);
            }
            else {
                System.out.println("Employee ID not found!");
            }
            displayAllEmployee(e);
        }
    }

    @Override
    public void deleteEmployee(Scanner sc, List<Employee> e)
    {
        int id,
                i = 0;
        boolean found = false;

        id = Validator.getInt(sc, "Enter ID for the record to be deleted: ");
        sc.nextLine();

        while ((i < e.size()) && (!found))
        {
            if (id == e.get(i).getId())
            {
                found = true;
            }
            else
            {
                i++;
            }
        }

        if(found) {
            e.remove(i);
            System.out.println("Employee record removed.");
        }
        else {
            System.out.println("ID not found!");
        }

        displayAllEmployee(e);
    }
}

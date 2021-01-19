package classwork.JDBC.CRUD;

import java.sql.*;
import java.util.Scanner;

public class EmployeeFunctions implements EmployeeInterface {
    String dbuser = "root";
    String dbpassword = "5M%k4nFv=RZt";
    String connString = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";

    Connection con = DriverManager.getConnection(connString, dbuser, dbpassword);
    Statement stmt = con.createStatement();
    PreparedStatement pstmt;

    public EmployeeFunctions() throws SQLException {
    }

    @Override
    public void displayAllEmployee()
    {
        System.out.println("\nEmployee List:");
        System.out.println("ID\t\tName\t\tAddress");

        try {
            ResultSet res = stmt.executeQuery("SELECT * FROM emp_info;");
            while(res.next()) {
                System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println();
    }

    @Override
    public void addEmployee(Scanner sc)
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

        try {
            ResultSet res = stmt.executeQuery("SELECT * FROM emp_info;");
            while(res.next()) {
                if (id == res.getInt(1))
                    duplicate = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (duplicate)
        {
            System.out.println("Error! Employee already exists in record.");
        }
        else
        {
            try {
                pstmt = con.prepareStatement("INSERT INTO emp_info (emp_id, name, address)" +
                        " VALUES (?, ?, ?)");
                pstmt.setInt(1, id);
                pstmt.setString(2, n);
                pstmt.setString(3, a);
                pstmt.executeUpdate();
                System.out.println("Employee record added.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        displayAllEmployee();
    }

    @Override
    public void editEmployee(Scanner sc)
    {
        int id;
        String n,
                a;
        boolean found = false;

        id = Validator.getInt(sc, "Enter ID for the record to be edited: ");
        sc.nextLine();

        try {
            ResultSet res = stmt.executeQuery("SELECT * FROM emp_info;");
            while(res.next()) {
                if (id == res.getInt(1))
                    found = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(found) {
            System.out.print("Enter name: ");
            n = sc.nextLine();
            System.out.print("Enter address: ");
            a = sc.nextLine();

            try {
                pstmt = con.prepareStatement("UPDATE emp_info SET name = ?, address = ? WHERE emp_id = ?;");
                pstmt.setString(1, n);
                pstmt.setString(2, a);
                pstmt.setInt(3, id);
                pstmt.executeUpdate();
                System.out.println("Employee record updated.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Employee ID not found!");
        }

        displayAllEmployee();
    }

    @Override
    public void deleteEmployee(Scanner sc)
    {
        int id;
        boolean found = false;

        id = Validator.getInt(sc, "Enter ID for the record to be deleted: ");
        sc.nextLine();

        try {
            ResultSet res = stmt.executeQuery("SELECT * FROM emp_info;");
            while(res.next()) {
                if (id == res.getInt(1))
                    found = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(found) {
            try {
                stmt.executeUpdate("DELETE FROM emp_info WHERE emp_id = " + id + ";");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Employee record removed.");
        }
        else {
            System.out.println("ID not found!");
        }

        displayAllEmployee();
    }
}

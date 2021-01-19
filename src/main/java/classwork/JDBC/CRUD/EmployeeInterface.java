package classwork.JDBC.CRUD;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public interface EmployeeInterface {
    void displayAllEmployee();
    void addEmployee(Scanner sc);
    void editEmployee(Scanner sc);
    void deleteEmployee(Scanner sc);
}
